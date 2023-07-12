package com.oops.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_2_1 {

	public static void main(String[] args) {
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","root");
			PreparedStatement ps=con.prepareStatement("insert into employ_details values(?,?,?,?)");
			Scanner input = new Scanner(System.in);
			while(true){
				System.out.println("enter employ eno: ");
				int eno=input.nextInt();
				System.out.println("enter employ name: ");
				String ename=input.next();
				System.out.println("enter ephone no: ");
				int eph=input.nextInt();
				System.out.println("enter esal: ");
				int esal=input.nextInt();
				
				
				ps.setInt(1, eno);
				ps.setString(2,ename);
				ps.setInt(3,eph);
				ps.setInt(4,esal);
				int count=ps.executeUpdate();
				if(count>0)
					System.out.println(count +"record inserted");
				else
					System.out.println("no record inserted...");
				System.out.println("dou want to more records...");
				
				String ch=input.next();
				if(ch.equalsIgnoreCase("no"))
				break;
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
