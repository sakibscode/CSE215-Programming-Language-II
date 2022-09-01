package Lab16_HW;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double price = scan.nextDouble();
		double discount = scan.nextDouble();

		PercentageDiscount PD = new PercentageDiscount(discount);
		ThresholdDiscount TD = new ThresholdDiscount(100, 10);

		System.out.println(PD.discountedPrice(price));
		System.out.println(TD.discountedPrice(price));

	}

}