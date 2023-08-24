package com.jdbc;
import java.sql.*;
import java.util.*;

public class InsertOperation {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			//Driver - translator between java and  database(mysql)
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//connection to establish connection between server and database
			Connection connection = DriverManager.getConnection(Constants.DBURL, Constants.DBUSERNAME, Constants.DBPASSWORD);
			System.out.println("Connection Established");
			//Statement object creation
			Statement statement = connection.createStatement();
			
			//Result set
			String insertCommand = "insert into jdbc_practice(id, name, salary) values(4,'charan',100000)";
			int resultSet = statement.executeUpdate(insertCommand);
			System.out.println(resultSet +" row inserted ");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
