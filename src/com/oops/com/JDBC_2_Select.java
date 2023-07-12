package com.oops.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_2_Select {

	public static void main(String[] args) {
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select*from employ_details");
			while(rs.next()){
				int eno=rs.getInt(1);
				String ename=rs.getString(2);
				int eph=rs.getInt(3);
				int esal=rs.getInt(4);
				
				System.out.println("Employ Eno:"+eno);
				System.out.println("Ename:"+ ename);
				System.out.println("eph no:"+ eph);
				System.out.println("esal:"+ esal);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
