package com.sanskar.entity;

public class LicenseType {
	
	private int licenseid;
	private String type;
	
	public LicenseType() {}
	
	public LicenseType(int licenseid, String type) {
		super();
		this.licenseid = licenseid;
		this.type = type;
	}

	public int getLicenseid() {
		return licenseid;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "LicenseType [licenseid=" + licenseid + ", type=" + type + "]";
	}
}
