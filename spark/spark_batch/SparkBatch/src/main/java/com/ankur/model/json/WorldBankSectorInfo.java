package com.ankur.model.json;

import java.io.Serializable;

public class WorldBankSectorInfo implements Serializable {
	
	private String Name;
	private int Percent;
	
	

	public int getPercent() {
		return Percent;
	}

	public void setPercent(int percent) {
		Percent = percent;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
	

}
