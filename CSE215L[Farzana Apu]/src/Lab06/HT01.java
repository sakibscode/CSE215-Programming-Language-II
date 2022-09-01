package Lab06;

import java.util.Scanner;

public class HT01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int dp[] = new int[n];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < n; i++)
			dp[i] = dp[i - 1] + dp[i - 2];

		System.out.print("First " + n + " Fibonacci numbers : ");
		for (int i = 0; i < n; i++)
			System.out.print(dp[i] + " ");
		sc.close();
	}

}