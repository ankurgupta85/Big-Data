package com.ankur.model.json;

import java.util.List;

import com.ankur.model.common.CustomModelClass;

public class Zip extends CustomModelClass {
	
	private String city;
	private List<Double> loc;
	private long pop;
	private String state;
	private String _id;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Double> getLoc() {
		return loc;
	}
	public void setLoc(List<Double> loc) {
		this.loc = loc;
	}
	public long getPop() {
		return pop;
	}
	public void setPop(long pop) {
		this.pop = pop;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	
	
	
	
}
