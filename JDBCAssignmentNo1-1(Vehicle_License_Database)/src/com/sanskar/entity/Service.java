package com.sanskar.entity;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import com.sanskar.DBConfig.DBConfig;

public class Service {
	
	private Connection conn;

	public Service() throws ClassNotFoundException, SQLException
	{
		conn = DBConfig.connectMySQL();
	}
	
	public void saveLicenseType(LicenseType LT) throws Exception
	{
		String query = String.format("INSERT INTO license_type(licenseid,type)VALUES(%d,'%s')", LT.getLicenseid(),LT.getType());
		Statement stmt = conn.createStatement();
		stmt.execute(query);
		System.out.println("License Data added Successfully ");
	}
	
	public void updateLicenseType(LicenseType LT) throws Exception
	{
		String query = String.format("UPDATE license_type SET type = '%s' WHERE licenseid = %d ",LT.getType(),LT.getLicenseid());
		Statement stmt = conn.createStatement();
		stmt.execute(query);
		System.out.println("License Data Updated Successfully ");
	}
	
	public void deleteLicenseType(LicenseType LT) throws Exception
	{
		String query = String.format("DELETE FROM license_type WHERE licenseid=%d", LT.getLicenseid());
		Statement stmt = conn.createStatement();
		stmt.execute(query);
		System.out.println("License Data Deleted Successfully ");
	}
	
	public void savePerson(Person P) throws Exception
	{
		String query = String.format("INSERT INTO Person(personid,personname,address,city,contactno,fklicenseid)VALUES(%d,'%s','%s','%s','%s',%d)", P.getPersonid(),P.getPersonname(),P.getAddress(),P.getCity(),P.getContactno(),P.getFklicenseid());
		Statement stmt = conn.createStatement();
		stmt.execute(query);
		System.out.println("Person Data added Successfully ");
	}
	
	public void updatePerson(Person P) throws Exception
	{
		String query = String.format("UPDATE Person SET personname='%s',address='%s',city='%s',contactno='%s',fklicenseid=%d WHERE personid = %d", P.getPersonname(),P.getAddress(),P.getCity(),P.getContactno(),P.getFklicenseid(),P.getPersonid());
		Statement stmt = conn.createStatement();
		stmt.execute(query);
		System.out.println("Person Data Updated Successfully ");
	}
	
	public void deletePerson(Person P) throws Exception
	{
		String query = String.format("DELETE FROM Person WHERE personid=%d", P.getPersonid());
		Statement stmt = conn.createStatement();
		stmt.execute(query);
		System.out.println("Person Data Deleted Successfully ");
	}
}
