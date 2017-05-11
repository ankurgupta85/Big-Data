package com.ankur.main.customclass.json;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import com.ankur.main.common.SparkBatchJob;
import com.ankur.model.json.Zip;
import com.ankur.util.constants.StringConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import scala.Tuple2;

public class ZipCustomClass extends SparkBatchJob {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5139934068914188178L;
	private static final Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();

	public static void main(String[] args) {
		String filePath = getFilePath(StringConstants.SAMPLE_DATA_JSON_FOLDER + "/" + StringConstants.ZIP_JSON_FILE);
		System.out.println(filePath);
		JavaSparkContext context = getContext(WorldBankCustomClass.class.getSimpleName());
		JavaRDD<String> data = context.textFile(filePath);
		JavaRDD<Zip> zipdata = data.map(str -> gson.fromJson(str, Zip.class));
		JavaPairRDD<String, Zip> zipStatePairData = zipdata.mapToPair(zip -> new Tuple2<String, Zip>(zip.getState(), zip));
		JavaPairRDD<String, Long> zipStateZipcodeCountPair = zipStatePairData.mapValues(zip -> 1L).reduceByKey((amount1, amount2) -> amount1 + amount2);
		zipStateZipcodeCountPair.foreach(tuple -> System.out.println("State name: " + tuple._1 + "  #zipcodes: " + tuple._2));

	}

}
