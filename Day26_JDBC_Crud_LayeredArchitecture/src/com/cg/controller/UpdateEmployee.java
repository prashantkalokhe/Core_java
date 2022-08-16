package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "prasnant@23";
		
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query = "UPDATE employee SET NAME = ? , E_MAIL = ? WHERE ID = ?";
			PreparedStatement p = c.prepareStatement(query);
			p.setString(1, "PRASHANT");
			p.setString(2, "kalokheprashant23@gmail.com");
			p.setInt(3, 124);
			
			int r = p.executeUpdate();
			if(r > 0)
			{
				System.out.println("New User is Inserted successfully");
			}
			c.close();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}