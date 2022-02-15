package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacrud","root","root");
		
	}
catch(Exception e)
	{
	e.printStackTrace();
	}
	}
}
