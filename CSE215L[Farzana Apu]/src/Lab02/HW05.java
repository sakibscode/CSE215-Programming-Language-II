package Lab02;

import java.util.Scanner;

public class HW05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int amount = scan.nextInt();

		int n1 = amount >= 500 ? 1 : 0;

		switch (n1) {
		case 0:
			System.out.println("INVALID AMOUNT");
			break;

		case 1:
			int n2 = amount % 500 == 0 ? 1 : 0;
			switch (n2) {
			case 0:
				System.out.println("INVALID AMOUNT");
				break;

			case 1:
				int n3 = amount <= 20000 ? 1 : 0;
				switch (n3) {
				case 0:
					System.out.println("EXCEEDED AMOUNT");
					break;
				case 1:
					System.out.println("TRANSACTION SUCCESSFUL");
					break;
				}
				break;
			}
			break;
		default:
			System.out.println("Error Occurred");
		}
		scan.close();
	}

}