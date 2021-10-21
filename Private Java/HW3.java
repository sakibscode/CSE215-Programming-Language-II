package Class2;
import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		double c, f;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius : ");
		c = scan.nextDouble();
		
		f = 9.0 / 5 * c + 32;
		
		System.out.print(c+ " Celsius is " +f+ " Fahrenheit");

	}

}