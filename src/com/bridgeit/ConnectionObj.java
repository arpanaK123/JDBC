package com.bridgeit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionObj {

	
	public static Connection getConnection() {
	try {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz","root","arpana");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}
}
