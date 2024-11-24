package com.crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeExecuteQuery {
	public void Fetchdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cemployee","root","Shivani@2003");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("Select*from employee ");
		while(rs.next()) {
			System.out.println("Employee ID= "+rs.getInt(1)+" Employee Name= "+rs.getString(2));
		}
		c.close();
	}
	public static void main(String[] args) throws Exception {
		EmployeeExecuteQuery Q=new EmployeeExecuteQuery();
		Q.Fetchdata();
	}

}
