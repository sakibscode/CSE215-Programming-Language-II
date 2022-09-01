package Lab14;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		while (i < 10) {
			try {
				System.out.print("\nEnter " + (i + 1) + "th Integer : ");
				int x = s.nextInt();
				if (x < 0) {
					Exception e = new Exception();
					throw e;
				} else {
					sum += x;
					i++;
				}
			} catch (Exception e) {
				System.out.println("Input positive integer only");
			}
		}
		System.out.println("\nThe Sum of above entered 10 positive Integers is : " + sum);
	}
}