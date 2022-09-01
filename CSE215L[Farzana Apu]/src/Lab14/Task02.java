package Lab14;

import java.util.Scanner;
import java.lang.Math;

public class Task02 {
	public static void main(String[] args) {

		int[] rand_arr = new int[100];

		for (int i = 0; i < 100; i++)
			rand_arr[i] = (int) (Math.random() * 10000);

		int index = 1000;

		Scanner sc = new Scanner(System.in);

		while (index >= 100) {

			System.out.print("\nEnter an integer: ");

			index = sc.nextInt();

			if (index >= 100)
				System.out.println("ERROR: Index out of range!");
		}

		System.out.println("At index = " + String.valueOf(index) + ", value = " + String.valueOf(rand_arr[index]));

	}

}