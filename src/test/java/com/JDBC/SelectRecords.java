package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecords {
	static final String DB_URL = "jdbc:mysql://localhost:3306/raghuveer";
	static final String USER = "user123";
	static final String PASS = "password123";
	static final String QUERY = "SELECT EmpID, EmpName, Salary, Designation from Employee";

	public static void main(String[] args) {
		// Open a connection
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
				// Display values
				System.out.print("Employee ID: " + rs.getInt("EmpID"));
				System.out.print(", Employee Name: " + rs.getString("EmpName"));
				System.out.print(", Employee Salary: " + rs.getInt("Salary"));
				System.out.println(",Employee Designation: " + rs.getString("Designation"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}