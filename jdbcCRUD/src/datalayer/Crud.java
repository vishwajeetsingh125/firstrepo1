package datalayer;

import java.util.Scanner;

public class Crud {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 if you want to create a  new entry  ");
		System.out.println("Enter 2 if you want to read records  ");
		System.out.println("Enter 3 if you want to update a record  ");
		System.out.println("Enter 4 if you want to delete a record  ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			DalUserC w = new DalUserC();
			break;
		case 2:
			DalUserR x = new DalUserR();
			break;
		case 3:
			DalUserU y = new DalUserU();
			break;
		case 4:
			DalUserD z = new DalUserD();
			break;
		default:
			System.out.println("Enter valid input!");
			break;

		}

	}

}
