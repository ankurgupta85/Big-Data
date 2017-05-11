package com.ankur.model.json;

import java.io.Serializable;

public class WorldBankMajorSector implements Serializable{

	private String Name;
	private int Percent;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPercent() {
		return Percent;
	}
	public void setPercent(int percent) {
		Percent = percent;
	}
	
	
	
	
}
