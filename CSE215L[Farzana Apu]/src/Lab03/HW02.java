package Lab03;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		int a = scan.nextInt();

		System.out.print("Enter Second Number : ");
		int b = scan.nextInt();

		int gcd = 1, hcf = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD : " + gcd);

		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		System.out.println("HCF : " + hcf);

		scan.close();
	}

}