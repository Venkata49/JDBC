package com.oops.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaOracleJdbc {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "sys as sysdba";
		String password = "root";
		
		try{
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("connected successfully....!");
		}catch(SQLException e){
			System.out.println("Oops, error...!");
			e.printStackTrace();
		}
		
	}

}
