package com.ankur.util.properties;

import java.util.Properties;

import com.ankur.util.constants.StringConstants;

public class PropertiesUtil {
	private static final Properties properties = new Properties();

	static {
		try {
			properties.load(PropertiesUtil.class.getClassLoader()
					.getResourceAsStream(StringConstants.PROPERTIES_FILE));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	public static long getLongProperty(String key) {
		return Long.parseLong(PropertiesUtil.getProperty(key));
	}

}
