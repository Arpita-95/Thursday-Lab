package com.ems.book;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnectionCreation {
	
	public static Connection getDBConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/java_vc","root","Root");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return con;
	}


}
