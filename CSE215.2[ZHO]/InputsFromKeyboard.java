package Lec1;

import java.util.Scanner;

public class InputsFromKeyboard {

	public static void main(String[] args) {
		int i, n = 0, s = 0, avg, max = 0, min = 0;

		for (i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);

			n = scan.nextInt();

			s += n;
		}
		System.out.println("Sum : " + s);

		avg = s / 10;
		System.out.println("Average : " + avg);

		if (n > max) {
			max = n;
			System.out.println("Maximum Number : " + max);
		}

	}

}