package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud_Insert {

	public static void main(String[] args) throws SQLException {
	
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "prashant@23";
		
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query = "INSERT INTO employee(ID,NAME,PASSWORD,E_MAIL)VALUES(?,?,?,?)";
			PreparedStatement p = c.prepareStatement(query);
			p.setInt(1, 122);
			p.setString(2, "Mark");
			p.setString(3, "mark123");
			p.setString(4, "mark234@gmail.com");
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