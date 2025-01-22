package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		
		//Step 1:Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2:Establish DatabaseApplication
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		//Step 3:Construct Sql Query
		String sql="insert into student183 values(2,'Ram')";
		//Step 4:Create object of Statements
		Statement smt=con.createStatement();
		//Step 5:Execute Sql Query
		smt.execute(sql);
		//step 6:Close the resources
		smt.close();
		con.close();
	}
}
