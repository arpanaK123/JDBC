package com.bridgeit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String args[]) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			// step2 create the connection object

			con = ConnectionObj.getConnection();
			if (con != null) {
				// step3 create the statement object
				stmt = con.createStatement();
				// step4 execute query
				rs = stmt.executeQuery("select * from user");

				while (rs.next()) {
					System.out.println(rs.getInt("PersonID"));
					System.out.println(rs.getString("FirstName"));
					System.out.println(rs.getString("LastName"));
					System.out.println(rs.getString("Address"));
					System.out.println(rs.getString("City"));
					// step5 close the connection object
				}
			}
			


		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}
}
