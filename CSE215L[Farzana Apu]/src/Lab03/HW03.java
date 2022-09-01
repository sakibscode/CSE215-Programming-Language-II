package Lab03;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = scan.nextInt();

		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println("Sum of digits : " + sum);

		scan.close();
	}

}     