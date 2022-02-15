package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DalUserD {
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacrud", "root", "root");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID where you want to delete records : ");
			int a = sc.nextInt();
			sc.close();

			PreparedStatement p = c.prepareStatement("DELETE FROM STUDENTSCRUD WHERE ID = ?");
			p.setInt(1, a);
			p.executeUpdate();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
