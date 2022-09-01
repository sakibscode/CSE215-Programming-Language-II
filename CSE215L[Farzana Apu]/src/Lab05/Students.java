package Lab05;

import java.util.Scanner;

public class Students {

	//public static int n;

	public static void printData(String name[], int id[], double CGPA[]) {
		int i;
		double sum = 0.0, average;

		System.out.print("\n\tName\t\tID\tCGPA\n--------------------------------------------\n");

		for (i = 0; i < 2; i++) {
			//System.out.printf("\n%-20s\t%5d\t%5.1f", name[i], id[i], cgpa[i]);
			System.out.print("NameL:"+name[i]);
			System.out.print("Id:"+id[i]);
			System.out.print("Cgpa:"+cgpa[i]);
			
			sum = sum + cgpa[i];
		}

		average = sum / 2;

		System.out.printf("\n Sum = %5.2f Average of CGPA : %5.2f", sum, average);
	}

	public static void printData(String name[], int marks[]) {
		int i, mark = 0, top = 0;

		for (i = 0; i < 2; i++) {
			if (mark < marks[i]) {
				mark = marks[i];
				top = i;
			}
		}

		System.out.println("\n Top Scorer's Information ");

		System.out.printf("\nName : %s\t\tMark : %d", name[top], marks[top]);
	}

	public static void main(String[] args) {
		int i;

		Scanner read = new Scanner(System.in);
		//System.out.print("Enter number of students : ");
		//n = read.nextInt();

		String[] name = new String[2];
		int[] id = new int[2];
		double[] cgpa = new double[2];
		int[] marks = new int[2];

		for (i = 0; i < 2; i++) {
			read.nextLine();
			System.out.print("\nEnter the name : ");
			name[i] = read.nextLine();

			System.out.print("Enter the id : ");
			id[i] = read.nextInt();

			System.out.print("Enter the Marks : ");
			marks[i] = read.nextInt();

			System.out.print("Enter the CGPA : ");
			cgpa[i] = read.nextDouble();

		}
		printData(name, id, cgpa);
		printData(name, marks);

	}

}