package com.ankur.main.customclass.json;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import com.ankur.main.common.SparkBatchJob;
import com.ankur.model.json.WorldBank;
import com.ankur.util.constants.StringConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import scala.Tuple2;

public class WorldBankCustomClass extends SparkBatchJob {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4899566609990959198L;
	private static final Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();

	public static void main(String[] args) {
		String filePath = getFilePath(StringConstants.SAMPLE_DATA_JSON_FOLDER + "/" + StringConstants.WORLD_BANK_JSON_FILE);
		System.out.println(filePath);
		JavaSparkContext context = getContext(WorldBankCustomClass.class.getSimpleName());
		JavaRDD<String> data = context.textFile(filePath);
		JavaRDD<WorldBank> worldBankData = data.map(str -> gson.fromJson(str, WorldBank.class));
		JavaPairRDD<String, WorldBank> worldBankPairData = worldBankData.mapToPair(wbank -> new Tuple2<String, WorldBank>(wbank.getCountryname(), wbank));
		JavaPairRDD<String, Long> worldBankCountryAmountPair = worldBankPairData.mapValues(wbank->wbank.getTotalcommamt()).reduceByKey((amount1,amount2)->amount1+amount2);
		worldBankCountryAmountPair.foreach(tuple->System.out.println("Country name: "+tuple._1+"  Amount: "+tuple._2));
		
	}

}
