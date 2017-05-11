package com.ankur.main.code.comparison;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.io.compress.GzipCodec;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.api.java.function.VoidFunction;

import com.ankur.main.common.SparkBatchJob;
import com.ankur.util.constants.StringConstants;

import scala.Tuple2;

public class WordCountVer1 extends SparkBatchJob {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3856609334194729256L;

	public static void main(String args[]) throws IOException {

		String filePath = getFilePath(StringConstants.SAMPLE_DATA_STRING_FOLDER + "/" + StringConstants.WORD_COUNT_TXT);

		JavaSparkContext context = getContext(WordCountVer1.class.getSimpleName());

		// Read complete data from file
		JavaRDD<String> data = context.textFile(filePath);

		/***
		 * Flatten the string as list of words Input: A B C -> One String
		 * Output: [A,B,C] -> Individual string
		 */
		JavaRDD<String> dataFlattened = data.flatMap(new FlatMapFunction<String, String>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 666870834158941974L;

			@Override
			public Iterator<String> call(String str) throws Exception {
				String[] strSplit = str.split(StringUtils.SPACE);
				List<String> wordList = Arrays.asList(strSplit);
				return wordList.iterator();
			}

		});

		System.out.println("Word count in file: " + dataFlattened.count());

		/***
		 * Map initial count for each string as 1 Input: [A,B,C] Output:
		 * [(A,1),(B,1),(C,1)]
		 */
		JavaPairRDD<String, Integer> wordCountMap = dataFlattened.mapToPair(new PairFunction<String, String, Integer>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -4909517765318305925L;

			@Override
			public Tuple2<String, Integer> call(String str) throws Exception {
				Tuple2<String, Integer> tuple = new Tuple2<String, Integer>(str, 1);
				return tuple;
			}
		});

		/***
		 * Aggregate counts Input: [(A,1),(B,1),(C,1),(A,1)] Output:
		 * [(A,2),(B,1),(C,1)]
		 */
		JavaPairRDD<String, Integer> wordCountAgg = wordCountMap.reduceByKey(new Function2<Integer, Integer, Integer>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -7537380137987615318L;

			@Override
			public Integer call(Integer v1, Integer v2) throws Exception {
				return v1 + v2;
			}
		});

		System.out.println("Aggregated Word count: " + wordCountAgg.count());

		// Print each word with frequency of appearance
		wordCountAgg.foreach(new VoidFunction<Tuple2<String, Integer>>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -621962116929217999L;

			@Override
			public void call(Tuple2<String, Integer> t) throws Exception {
				System.out.println(t._1 + "   " + t._2);

			}
		});

		// Save output data in zipped files
		wordCountAgg.saveAsTextFile("/tmp/" + WordCountVer1.class.getSimpleName() + "/zipped", GzipCodec.class);

		// Save output data in unzipped files
		wordCountAgg.saveAsTextFile("/tmp/" + WordCountVer1.class.getSimpleName() + "/unzipped");

		context.stop();
		context.close();
	}

}
