package ProblemSolve;
import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) {
		double a, b, c;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		
		c = (a * 3.5 + b * 7.5) / (3.5 + 7.5);
		
		System.out.printf("MEDIA = %.5f\n", c);

	}

}
