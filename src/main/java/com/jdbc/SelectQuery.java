package com.jdbc;

import java.sql.*;

public class SelectQuery {

	public static void main(String[] args) {
		try {

			// Step -- 1 Loading Driver - Like Translator for Java and MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step -- 2 to establish the connection between server and Database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			System.out.println("Connection Established");
			
			// Step -- 3 Creating Statement Object - query or update we have to perform 
			Statement statement = connection.createStatement();
			
			// Step -- 4 ResultSet 
			String sqlQuery = "SELECT * FROM jdbc_practice";
			ResultSet resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t\t" + resultSet.getString(3) );
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
