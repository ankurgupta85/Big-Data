package com.ankur.main.common;

import java.io.Serializable;
import java.net.URL;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import com.ankur.main.customclass.csv.TitanicCustomClass;
import com.ankur.util.properties.PropertiesKeys;
import com.ankur.util.properties.PropertiesUtil;

public class SparkBatchJob implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5613278001726923034L;

	private static JavaSparkContext context;

	public static String getFilePath(String resourcename) {
		URL resource = TitanicCustomClass.class.getClassLoader().getResource(resourcename);
		return resource.getPath();
	}

	public static JavaSparkContext getContext(String appName) {
		String master = PropertiesUtil.getProperty(PropertiesKeys.MASTER);
		SparkConf conf = new SparkConf().setMaster(master).setAppName(appName);
		context = new JavaSparkContext(conf);
		return context;
	}

	public static void stopContext() {
		if (context != null) {
			context.stop();
			context.close();
		}
	}

}
