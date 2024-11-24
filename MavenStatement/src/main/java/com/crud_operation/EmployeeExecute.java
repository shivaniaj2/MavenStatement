package com.crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeExecute {
	public void createTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cemployee","root","Shivani@2003");
		Statement s=c.createStatement();
		s.execute("Create table student2(stu_id int primary key,name varchar(30),marks int)");
		//s.executeUpdate("insert into student2 values(21,'Shivani',40)");
		System.out.println("Table is created Successfully...");
		c.close();
		
	}
	public void alterTable() throws Exception { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cemployee","root","Shivani@2003");
		Statement s=c.createStatement();
		//s.execute("ALTER TABLE student ADD age INT");
		s.execute("ALTER TABLE student CHANGE age standard INT");
		System.out.println("Table is alter Successfully....");
		c.close();
	}
	
	public void dropTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cemployee","root","Shivani@2003");
		Statement s=c.createStatement();
		s.execute("DROP TABLE STUDENT1");
		System.out.println("Table is drop Successfully....");
		c.close();
	}
	
	
	public void truncate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cemployee","root","Shivani@2003");
		Statement s=c.createStatement();
		s.execute("TRUNCATE TABLE student2;");
		System.out.println("Table is Truncate Successfully....");
		c.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		EmployeeExecute S=new EmployeeExecute();
		//S.createTable();
		//S.alterTable();
		//S.dropTable();
		//S.truncate();
	}

	

}
