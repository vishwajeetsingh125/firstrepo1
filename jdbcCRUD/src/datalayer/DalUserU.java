package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DalUserU {

	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacrud", "root", "root");
			System.out.println("Sucessful");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID where you want to make changes : ");
			int e = sc.nextInt();
			System.out.println("Enter updated First name :");
			String a = sc.next();
			System.out.println("Enter the Updated Last name:");
			String b = sc.next();
			System.out.println("Enter the updated Email: ");
			String d = sc.next();
			sc.close();

			PreparedStatement p2 = c
					.prepareStatement("UPDATE STUDENTSCRUD SET FNAME = ?, LNAME = ?, EMAIL = ?  WHERE ID = ?");
			p2.setString(1, a);
			p2.setString(2, b);
			p2.setString(3, d);
			p2.setInt(4, e);
			p2.executeUpdate();
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
