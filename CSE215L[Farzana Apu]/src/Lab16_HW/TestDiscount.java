package Lab16_HW;

import java.util.Scanner;

public class TestDiscount {
	public static void main(String[] args) {

		// Scanner to take user input
		Scanner sc = new Scanner(System.in);

		// get price and discount from user
		double price = sc.nextDouble();
		double discount = sc.nextDouble();

		// create objects
		PercentageDiscount PD = new PercentageDiscount(discount);
		ThresholdDiscount TD = new ThresholdDiscount(100, 10);

		// call discountedPrice method
		System.out.println(PD.discountedPrice(price));
		System.out.println(TD.discountedPrice(price));

	}

}