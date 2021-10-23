package Lec1;
import java.util.Scanner;

public class AreaOfThatCircle {

	public static void main(String[] args) {
		double r, a;
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Enter the radius : ");
		r = scan.nextDouble();
		
		a = Math.PI * r * r;
		
		System.out.print("Area of circle is : " +a);

	}

}
