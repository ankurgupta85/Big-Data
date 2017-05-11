package com.ankur.model.csv;

import com.ankur.model.common.CustomModelClass;

public class TitanicPassenger extends CustomModelClass {

	private int rownum;
	private String lastname;
	private String firstname;
	private String pclass;
	private int age;
	private String sex;
	private boolean survived;
	private int sexcode;

	public TitanicPassenger(String row) {
		try {
			String[] rowsplit = row.split(",");
			this.setRownum(Integer.parseInt(rowsplit[0]));
			this.setLastname(rowsplit[1]);
			this.setFirstname(rowsplit[2]);
			this.setPclass(rowsplit[3]);
			if (rowsplit[4].equals("NA")) {
				this.setAge(-1);
			} else {
				this.setAge(Integer.parseInt(rowsplit[4]));
			}
			this.setSex(rowsplit[5]);
			if (Integer.parseInt(rowsplit[6]) == 1) {
				this.setSurvived(true);
			}
			this.setSexcode(Integer.parseInt(rowsplit[7]));
		} catch (Exception e) {
			System.out.println("Row: " + row + " threw exception: " + e.getMessage());
		}

	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	public String getPclass() {
		return pclass;
	}

	public void setPclass(String pclass) {
		this.pclass = pclass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isSurvived() {
		return survived;
	}

	public void setSurvived(boolean survived) {
		this.survived = survived;
	}

	public int getSexcode() {
		return sexcode;
	}

	public void setSexcode(int sexcode) {
		this.sexcode = sexcode;
	}

}
