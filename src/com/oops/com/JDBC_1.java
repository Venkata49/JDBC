package com.oops.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_1 {

	public static void main(String[] args) throws SQLException  {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","sys as sysdba","root");
		Statement st=con.createStatement();
		st.executeUpdate("create table student(sno number(3),firstname varchar2(10),lastname varchar2(10),sclass number(3))");
		con.close();
		
	}

}
