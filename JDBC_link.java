package com.pranav.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "ganesh99");
			System.out.println(connection);
			Statement statement = connection.createStatement();
			//long result = statement.executeUpdate("insert into account values(3, 'webdriver','Selenium', 1000)");
			//System.out.println(result + " Rows got inserted");
			
			//int executeUpdate = statement.executeUpdate("Update account set bal = 50000 where accno=1");
			
			//System.out.println(executeUpdate + " Rows got inserted");
			statement.executeLargeUpdate("delete from account where accno=2");
			System.out.println("Row Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
