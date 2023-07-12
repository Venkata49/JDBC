package com.oops.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","sys as sysdba","root");
		
		PreparedStatement prt=con.prepareStatement("insert into student values(?,?,?,?)");
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner br=new Scanner(System.in);
		while(true){
			System.out.println("enter student id : ");
			int sno=br.nextInt();
			System.out.println("enter firstname : ");
			String firstname=br.next();
			System.out.println("enter lastname : ");
			String lastname=br.next();
			System.out.println("enter class : ");
			int sclass=br.nextInt();
			
			prt.setInt(001,sno);
			prt.setString(2, firstname);
			prt.setString(3, lastname);
			prt.setInt(4,sclass);
			
			int count=prt.executeUpdate();
			if(count>0)
				System.out.println(count+"record inserted");
			else
				System.out.println("record not inserted");
			
			System.out.println("dou you want insert more records...");
			String ch=br.next();
			if(ch.equalsIgnoreCase("no"))
				break;
			
		}
	}

}
