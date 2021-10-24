package Lec1;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int n;
		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.print(n + " is a prime number.");
		} else {
			System.out.print(n + " is not a prime number.");
		}

	}

}