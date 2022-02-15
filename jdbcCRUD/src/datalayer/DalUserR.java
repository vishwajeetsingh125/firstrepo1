package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DalUserR {
	{

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacrud", "root", "root");
			System.out.println("Connection Suceeded");
			Statement s1 = c.createStatement();
			ResultSet r1 = s1.executeQuery("SELECT * FROM studentscrud");
			while (r1.next()) {
				System.out.println(r1.getInt("ID") + " " + r1.getString("FNAME") + " " + r1.getString("LNAME") + " "
						+ r1.getString("EMAIL"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
