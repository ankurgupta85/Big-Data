package com.ankur.model.common;

import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CustomModelClass implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 2401625987983736685L;

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
		return gson.toJson(this);
	}

}
