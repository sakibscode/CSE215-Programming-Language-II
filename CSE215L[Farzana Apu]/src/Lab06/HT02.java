package Lab06;

import java.util.Arrays;

public class HT02 {

	public static void main(String[] args) {
		int[] inp = { 5, 8, 9, 12, 13, 14, 15, 18, 19, 20 };
		int n = inp.length;

		int[] a = new int[(n + 1) / 2];
		int[] b = new int[n - a.length];

		for (int i = 0; i < n; i++) {
			if (i < a.length) {
				a[i] = inp[i];
			} else {
				b[i - a.length] = inp[i];
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}