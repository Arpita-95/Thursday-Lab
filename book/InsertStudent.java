package com.ems.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudent {
	
public static void insertStudent() {
		
		try(Connection conn=DataBaseConnectionCreation.getDBConnection();
				Scanner sc=new Scanner(System.in))
		{
			String sql="insert into student_info values(?,?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			//taking user inputs of student information
			System.out.println("Enter id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name: ");
			String name=sc.nextLine();
			System.out.println("Enter marks");
			int marks=sc.nextInt();
			System.out.println("Enter email: ");
			String email=sc.next();
			System.out.println("Enter city :");
			String city=sc.next();
			System.out.println("Enter standard: ");
			int standard=sc.nextInt();
			
			//setting variables to their respective fields
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, marks);
			ps.setString(4, email);
			ps.setString(5, city);
			ps.setInt(6, standard);
			
			int row=ps.executeUpdate();
			//conn.commit();
			System.out.println(row+" row inserted successfully");	
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


}
