package com.ankur.main.customclass.csv;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import com.ankur.main.common.SparkBatchJob;
import com.ankur.model.csv.TitanicPassenger;
import com.ankur.util.constants.StringConstants;

import scala.Tuple2;

public class TitanicCustomClass extends SparkBatchJob {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8043065126852261437L;

	public static void main(String[] args) {
		String filePath = getFilePath(StringConstants.SAMPLE_DATA_CSV_FOLDER + "/" + StringConstants.TITANIC_CSV_FILE);
		System.out.println(filePath);
		JavaSparkContext context = getContext(TitanicCustomClass.class.getSimpleName());
		JavaRDD<String> data = context.textFile(filePath);
		JavaRDD<TitanicPassenger> titanicData = data.map(str -> new TitanicPassenger(str));
		JavaPairRDD<String, List<TitanicPassenger>> titanic_by_gender = titanicData.mapToPair(passenger -> {
			List<TitanicPassenger> passenger_list = new ArrayList<>();
			passenger_list.add(passenger);
			return new Tuple2<String, List<TitanicPassenger>>(passenger.getSex(), passenger_list);
		}).reduceByKey((list1, list2) -> {
			list1.addAll(list2);
			return list1;
		});
		JavaPairRDD<String, Integer> titanic_by_gender_count = titanic_by_gender.mapToPair(tuple -> new Tuple2<String, Integer>(tuple._1, tuple._2.size()));
		titanic_by_gender_count.sortByKey().foreach(tuple -> System.out.println("Gender: " + tuple._1 + "   Count: " + tuple._2));
	}

}
