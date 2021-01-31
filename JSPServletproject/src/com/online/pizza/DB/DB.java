package com.online.pizza.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	public static Connection getDb() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservlet", "root", "");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		return null;
	}

}
