package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployee {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "prashant@23";
		
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query = "DELETE FROM employee WHERE ID = ? ";
			PreparedStatement p = c.prepareStatement(query);
			p.setInt(1, 124);
			
			int r = p.executeUpdate();
			if(r > 0)
			{
				System.out.println("New User is Deleted successfully");
			}
			c.close();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
}