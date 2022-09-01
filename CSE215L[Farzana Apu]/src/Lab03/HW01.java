package Lab03;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		String choice = "";

		int sum = 0;
		int product = 1;
		int count = 0;

		Scanner scan = new Scanner(System.in);

		while (!choice.equals("0")) {
			System.out.print("Enter a number OR Press 0 to quit : ");
			choice = scan.next();

			if (!choice.equals("0")) {
				int number = Integer.parseInt(choice);
				sum = sum + number;
				product = product * number;
				count++;
			}
		}

		System.out.println("Average is : " + (float) sum / count);
		System.out.println("Product is : " + product);

		scan.close();
	}

}