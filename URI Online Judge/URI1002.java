package ProblemSolve;
import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {
		double A, R;
		
		Scanner scan = new Scanner(System.in);
		
		R = scan.nextDouble();
		
		A = 3.14159 * R * R;
		
		System.out.printf("A=%.4f", A);

	}

}
