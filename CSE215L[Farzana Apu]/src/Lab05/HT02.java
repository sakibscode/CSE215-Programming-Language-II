package Lab05;

import java.util.Scanner;

public class HT02 {
	public static void Print(String name[], int id[], double cgpa[]) {
		double sum = 0.0, average;
		for (int i = 0; i < 2; i++) {
			System.out.print("\nName : " + name[i]);
			System.out.print("\nId : " + id[i]);
			System.out.print("\nCGPA : " + cgpa[i]);

			sum = sum + cgpa[i];
		}

		average = sum / 2;

		System.out.printf("\nSum : %5.2f\nAverage of CGPA : %5.2f", sum, average);

	}

	public static void Print(String name[], int marks[]) {
		int mark = 0, top = 0;

		for (int i = 0; i < 2; i++) {
			if (mark < marks[i]) {
				mark = marks[i];
				top = i;
			}
		}

		System.out.println("\n\nTop Scorer's Information --> ");

		System.out.printf("\nName : %s\t\tMark : %d", name[top], marks[top]);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] name = new String[2];
		int[] id = new int[2];
		double[] cgpa = new double[2];
		int[] marks = new int[2];

		for (int i = 0; i < 2; i++) {
			in.nextLine();
			System.out.print("\nEnter the name : ");
			name[i] = in.nextLine();

			System.out.print("Enter the id : ");
			id[i] = in.nextInt();

			System.out.print("Enter the Marks : ");
			marks[i] = in.nextInt();

			System.out.print("Enter the CGPA : ");
			cgpa[i] = in.nextDouble();

			

		}
		Print(name, id, cgpa);
		Print(name, marks);

	}

}