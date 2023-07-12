package com.oops.com;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_3 {

	public static void main(String[] args) {
		
		try{
			Class.forName("oracle.jdbc.drier.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","root");
			Statement smt=con.createStatement();
			smt.executeUpdate("create table customer(cus_num number,company varchar(20),cus_rep number,credit_limit number(7,2))");
			//smt.close();
			
			System.out.println("table successfully created...");
			//con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
