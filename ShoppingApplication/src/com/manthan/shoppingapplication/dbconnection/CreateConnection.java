package com.manthan.shoppingapplication.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
	public Connection createConnection() {
		Connection con=null;
		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");
			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
