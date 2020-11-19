package com.sanskar.entity;

public class Person {
	
	private int personid;
	private String personname;
	private String address;
	private String city;
	private String contactno;
	private int fklicenseid;
	
	public Person() {}
	
	public Person(int personid, String personname, String address, String city, String contactno, int fklicenseid) {
		super();
		this.personid = personid;
		this.personname = personname;
		this.address = address;
		this.city = city;
		this.contactno = contactno;
		this.fklicenseid = fklicenseid;
	}

	public int getPersonid() {
		return personid;
	}

	public String getPersonname() {
		return personname;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getContactno() {
		return contactno;
	}

	public int getFklicenseid() {
		return fklicenseid;
	}

	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personname=" + personname + ", address=" + address + ", city=" + city
				+ ", contactno=" + contactno + ", fklicenseid=" + fklicenseid + "]";
	}
		
}
