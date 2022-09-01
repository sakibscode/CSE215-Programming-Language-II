package Lab02;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int noOfStudent = 3;

		String[] name = new String[noOfStudent];
		int[] id = new int[noOfStudent];
		String[] section = new String[noOfStudent];
		double[] cgpa = new double[noOfStudent];
		String[] gender = new String[noOfStudent];

		for (int i = 0; i < noOfStudent; i++) {
			System.out.println("\nEnter " + (i + 1) + "st Student Information -->");
			System.out.print("Enter Name : ");
			name[i] = scan.nextLine();
			System.out.print("Enter ID : ");
			id[i] = scan.nextInt();
			scan.nextLine();
			System.out.print("Enter Section : ");
			section[i] = scan.nextLine();
			System.out.print("Enter CGPA : ");
			cgpa[i] = scan.nextDouble();
			scan.nextLine();
			System.out.print("Enter Gender : ");
			gender[i] = scan.nextLine();
		}

		System.out.println("\nFemale Students With Name Length 4 -->");
		for (int i = 0; i < noOfStudent; i++) {
			if (gender[i].equals("female") && name[i].length() == 4) {
				System.out.println("ID : " + id[i]);
				System.out.println("Section : " + section[i]);
			}
		}

		System.out.println("\nMale Students with Name Starting With 'S' -->");
		for (int i = 0; i < noOfStudent; i++) {
			if (gender[i].equals("male") && name[0].charAt(0) == 'S') {
				System.out.println("Name : " + name[i]);
				System.out.println("CGPA : " + cgpa[i]);
			}
		}

		scan.close();

	}

} 