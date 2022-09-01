package Lab04;

import java.util.Scanner;

public class HT02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = in.nextInt();
		System.out.println(+grade(a));

		in.close();
	}

	public static int grade(int a) {

		if (91 <= a && a <= 100) {
			System.out.println("The grade is 'A'.");

		} else if (81 <= a && a <= 90) {
			System.out.println("The grade is 'B+'.");
		} else if (71 <= a && a <= 80) {
			System.out.println("The grade is 'B'.");
		} else if (61 <= a && a <= 70) {
			System.out.println("The grade is 'C'.");
		} else if (51 <= a && a <= 60) {
			System.out.println("The grade is 'D'.");
		} else if (a <= 40) {
			System.out.println("Fail.");
		} else
			System.out.println("you enter (41=50)");

		return a;

	}

}