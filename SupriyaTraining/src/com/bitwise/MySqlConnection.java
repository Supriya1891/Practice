package com.bitwise;

import java.beans.Statement;
import java.sql.*;

public class MySqlConnection {
	
	static int RollNo,Class;
	static String Name;

     public static void main(String[] args)
	  {
	    try
	    {
	      String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/test";
	      Connection conn = DriverManager.getConnection(myUrl, "root", "");

	      // MySql select statement
	      Statement stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery("select * from students where class = 6");
	      
	      while (rs.next()) {
	    	  int RollNo = rs.getShort(RollNo);
	    	  String Name = rs.getString("Name");
	    	  int Class = rs.getShort(Class);
	    	  System.out.println(RollNo + Name + Class + "\n");
	    	}
	      
	      // the mysql insert statement
	      String query = " insert into students (RollNo, Name, Class) values (" + RollNo +"," +Name +"," +Class+")";

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString (1, "Vihaan");
	      preparedStmt.setInt (2, 21);
	      preparedStmt.setInt   (3, 6);
	    
	      // execute the preparedstatement
	      preparedStmt.execute();
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	  }
	}