package com.crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee_ExecuteUpdate {
	public void insertdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cemployee","root","Shivani@2003");
		Statement s=c.createStatement();
		s.executeUpdate("insert into employee values(28,'Papu',35780,22)");
		System.out.println("Data is inserted....");
		c.close();
	}
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cemployee","root","Shivani@2003");
		Statement s=c.createStatement();
		s.executeUpdate("update employee set name='Sami' where emp_id=24");
		System.out.println("Data is Updated....");
		c.close();
	}
	public void delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cemployee","root","Shivani@2003");
		Statement s=c.createStatement();
		s.executeUpdate("delete from employee where emp_id=23");
		System.out.println("Data is Delete....");
		c.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		Employee_ExecuteUpdate d=new Employee_ExecuteUpdate();
		d.insertdata();
		//d.updateData();
		//d.delete();
	}

}
