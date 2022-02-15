package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DalUserC {

	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacrud", "root", "root");
			System.out.println("Connection Suceeded");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID of the new user : ");
			int a = sc.nextInt();
			
			System.out.println("Enter First name :");
			String b = sc.next();
			
			System.out.println("Enter Last name:");
			String d = sc.next();
			
			System.out.println("Enter Email: ");
			String e = sc.next();
			
			sc.close();

			PreparedStatement p1 = c.prepareStatement("insert into studentscrud values(?,?,?,?)");
			p1.setInt(1, a);
			p1.setString(2, b);
			p1.setString(3, d);
			p1.setString(4, e);
			p1.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
