package com.start.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class welcomeNew1{
	public static void main(String[] args)throws SQLException{
		
		//Create a Connection...
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","sys as sysdba","root");
		
		
		//create query/stsatement...
		Statement st=con.createStatement();
		//String s="insert into std values(6,'devid',20,12,117)";
		
		//String s1="delete from std where sno=5";
		
		//execute statement/query...
		//st.executeQuery(s);
		//st.executeQuery(s1);
		
		String s="select*from std";
		ResultSet rs=st.executeQuery(s);
		while(rs.next()){
			int sno=rs.getInt("sno");
			String sname=rs.getString("sname");
			System.out.println(sno+"  "+sname);
		}
		
		
		
		//close connection...
		con.close();
		
		System.out.println("program completed..");
	
	}
}
