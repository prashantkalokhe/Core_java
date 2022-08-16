package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveEmployee {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "prashant@23";
		
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query = "SELECT * FROM employee";
			Statement s = c.createStatement();
			
			ResultSet r = s.executeQuery(query);
			//int count = 0;
			while(r.next())
			{
				int id = r.getInt(1);
				String name = r.getString(2);
				String password = r.getString(3);
				String email = r.getString(4);
				
				String output = "User : %d %s %s %s";
				System.out.println(String.format(output,id,name,password,email));
			}
			c.close();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}