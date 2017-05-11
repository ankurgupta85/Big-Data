package com.ankur.main.customclass.csv;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import com.ankur.main.common.SparkBatchJob;
import com.ankur.model.csv.Birthday;
import com.ankur.util.constants.StringConstants;

import scala.Tuple2;

public class BirthdaysCustomClass extends SparkBatchJob {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8043065126852261437L;

	public static void main(String[] args) {
		String filePath = getFilePath(StringConstants.SAMPLE_DATA_CSV_FOLDER + "/" + StringConstants.BIRTHDAYS_CSV_FILE);
		System.out.println(filePath);
		JavaSparkContext context = getContext(BirthdaysCustomClass.class.getSimpleName());
		JavaRDD<String> data = context.textFile(filePath);
		JavaRDD<Birthday> birthdayData = data.map(str -> new Birthday(str));
		JavaPairRDD<Integer, List<Birthday>> birth_by_year= birthdayData.mapToPair(birthday->{
			List<Birthday> birthday_list = new ArrayList<>();
			birthday_list.add(birthday);
			return new Tuple2<Integer,List<Birthday>>(birthday.getYear(),birthday_list);
		}).reduceByKey((list1,list2)->{
			list1.addAll(list2);
			return list1;
		});
		JavaPairRDD<Integer, Integer> birth_by_year_count = birth_by_year.mapToPair(tuple->new Tuple2<Integer,Integer>(tuple._1,tuple._2.size()));
		birth_by_year_count.sortByKey().foreach(tuple->System.out.println("Year: "+tuple._1+"   Count: "+tuple._2));
	}

}
