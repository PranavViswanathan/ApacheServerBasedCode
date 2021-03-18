package com.pranav.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	public static void main(String[] args) {
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "ganesh99");
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select * from account");) {
			
			System.out.println(connection);
			
			//long result = statement.executeUpdate("insert into account values(2, 'viswanathan','Nana', 1000000)");
			//System.out.println(result + " Rows got inserted");
			
			//int executeUpdate = statement.executeUpdate("Update account set bal = 50000 where accno=1");
			
			//System.out.println(executeUpdate + " Rows got inserted");
			//statement.executeLargeUpdate("delete from account where accno=2");
			//System.out.println("Row Deleted");
			
			while (rs.next()) {
				//System.out.println(rs.getNString(2));
				System.out.println(rs.getNString(3));
				//System.out.println(rs.getNString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
