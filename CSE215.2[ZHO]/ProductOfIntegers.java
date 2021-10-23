package Lec1;
import java.util.Scanner;

public class ProductOfIntegers {

	public static void main(String[] args) {
		int x, y, P;
		
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		P = x * y;
		
		System.out.print("Product of those integers : " +P);

	}

}
