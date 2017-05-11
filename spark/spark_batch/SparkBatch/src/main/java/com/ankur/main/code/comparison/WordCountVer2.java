package com.ankur.main.code.comparison;

import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.io.compress.GzipCodec;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import com.ankur.main.common.SparkBatchJob;
import com.ankur.util.constants.StringConstants;

import scala.Tuple2;

public class WordCountVer2 extends SparkBatchJob {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4635395606017281543L;

	public static void main(String args[]) throws IOException {

		String filePath = getFilePath(StringConstants.SAMPLE_DATA_STRING_FOLDER + "/" + StringConstants.WORD_COUNT_TXT);
		System.out.println(filePath);

		JavaSparkContext context = getContext(WordCountVer2.class.getSimpleName());
		JavaRDD<String> data = context.textFile(filePath);

		/***
		 * Flatten the string as list of words Input: A B C -> One String
		 * Output: [A,B,C] -> Individual string
		 */
		JavaRDD<String> dataFlattened = data.map(str -> str.split(StringUtils.SPACE)).flatMap(strSplit -> Arrays.asList(strSplit).iterator());

		// Print count of Strings available
		System.out.println("Word count in file: " + dataFlattened.count());

		/***
		 * Map initial count for each string as 1 Input: [A,B,C] Output:
		 * [(A,1),(B,1),(C,1)]
		 */
		JavaPairRDD<String, Integer> wordCountMap = dataFlattened.mapToPair(word -> new Tuple2<String, Integer>(word, 1));

		/***
		 * Aggregate counts Input: [(A,1),(B,1),(C,1),(A,1)] Output:
		 * [(A,2),(B,1),(C,1)]
		 */
		JavaPairRDD<String, Integer> wordCountAgg = wordCountMap.reduceByKey((v1, v2) -> v1 + v2);

		System.out.println("Aggregated Word count: " + wordCountAgg.count());

		// Print each word with frequency of appearance
		wordCountAgg.foreach(t -> System.out.println(t._1 + "   " + t._2));

		// Save output data in zipped files
		wordCountAgg.saveAsTextFile("/tmp/" + WordCountVer2.class.getSimpleName() + "/zipped", GzipCodec.class);

		// Save output data in unzipped files
		wordCountAgg.saveAsTextFile("/tmp/" + WordCountVer2.class.getSimpleName() + "/unzipped");

		context.stop();
		context.close();
	}

}
