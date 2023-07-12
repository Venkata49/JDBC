package com.oops.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JDBC_2 {

	public static void main(String[] args){
		try{
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","root");
		Statement st=con.createStatement();
		st.executeUpdate("create table employ_details(eno number(3),ename varchar(25),eph number(10),esal number(5))");
		System.out.println("table created successfully");
		con.close();
		
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
