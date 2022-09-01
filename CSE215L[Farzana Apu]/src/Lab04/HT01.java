package Lab04;

import java.util.Scanner;

public class HT01 {
	class Student {
		String name;
		int marks;
		double cgpa;

		Student(String n, int m, double c) {
			this.name = n;
			this.marks = m;
			this.cgpa = c;
		}
	}

	public class temp {
		public static void allSum(Student[] arr1, Student[] arr2) {
			int total_marks = 0;
			double total_cgpa = 0;
			for (int i = 0; i < 4; i++) {
				total_cgpa = total_cgpa + arr1[i].cgpa + arr2[i].cgpa;
				total_marks = total_marks + arr1[i].marks + arr2[i].marks;
			}
			System.out.println("All Sum");
			System.out.println("Total Marks : " + total_marks);
			System.out.println("Total CGPA : " + total_cgpa);
		}

		public static void allAverage(Student[] arr1, Student[] arr2) {
			int avg_marks = 0;
			double avg_cgpa = 0;
			for (int i = 0; i < 4; i++) {
				avg_cgpa = avg_cgpa + arr1[i].cgpa + arr2[i].cgpa;
				avg_marks = avg_marks + arr1[i].marks + arr2[i].marks;
			}
			avg_cgpa = avg_cgpa / 8;
			avg_marks = avg_marks / 8;

			System.out.println("All Average");
			System.out.println("Average Marks : " + avg_marks);
			System.out.println("Average CGPA : " + avg_marks);
		}

		public static void evenSum(Student[] arr1) {
			int even_marks = 0;
			double even_cgpa = 0;
			for (int i = 0; i < 4; i++) {
				even_cgpa = even_cgpa + arr1[i].cgpa;
				even_marks = even_marks + arr1[i].marks;
			}
			System.out.println("Even Sum");
			System.out.println("Even Marks : " + even_marks);
			System.out.println("Even CGPA : " + even_cgpa);
		}

		public static void oddSum(Student[] arr1) {
			int odd_marks = 0;
			double odd_cgpa = 0;
			for (int i = 0; i < 4; i++) {
				odd_cgpa = odd_cgpa + arr1[i].cgpa;
				odd_marks = odd_marks + arr1[i].marks;
			}
			System.out.println("Odd Sum");
			System.out.println("Odd Marks : " + odd_marks);
			System.out.println("Odd CGPA : " + odd_cgpa);
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Student s;
			Student[] arr_odd = new Student[4];
			Student[] arr_even = new Student[4];
			String name;
			int marks;
			double cgpa;
			int even = 0, odd = 0;
			for (int i = 0; i < 8; i++) {
				System.out.println("Student " + (i + 1));
				System.out.print("Enter Name : ");
				name = scan.nextLine();
				System.out.print("Enter Marks : ");
				marks = Integer.parseInt(scan.nextLine());
				System.out.print("Enter CGPA : ");
				cgpa = Double.parseDouble(scan.nextLine());
				s = new Student(name, marks, cgpa);
				if (i % 2 == 0) {
					arr_even[even] = s;
					even = even + 1;
				} else {
					arr_odd[odd] = s;
					odd = odd + 1;
				}
			}
			oddSum(arr_odd);
			evenSum(arr_even);
			allSum(arr_even, arr_odd);
			allAverage(arr_even, arr_odd);

			scan.close();
		}
	}

}