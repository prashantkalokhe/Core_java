package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployee {
	
	public static void main(String[] args) throws SQLException {
		
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "prashant@23";
		
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query = "INSERT INTO employee(ID,NAME,PASSWORD,E_MAIL)VALUES(?,?,?,?)";
			PreparedStatement p = c.prepareStatement(query);
			p.setInt(1, 124);
			p.setString(2, "Jenny");
			p.setString(3, "jenny123");
			p.setString(4, "jenny234@gmail.com");
			int r = p.executeUpdate();
			//If row is greater than 0 then at least some rows are there
			if(r > 0)
			{
				System.out.println("New User is Inserted successfully");
				c.close();
			}
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}