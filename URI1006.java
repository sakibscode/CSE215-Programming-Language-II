package ProblemSolve;
import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) {
		double A, B, C, d;
		
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		
		d = (A / 10.0 * 2) + (B / 10.0 * 3) + (C / 10.0 * 5);
		
		System.out.printf("MEDIA = %.1f", d);

	}

}
