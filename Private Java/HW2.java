package Class2;
import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		double g, t, gr, st;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate : ");
		st = scan.nextDouble();
		gr = scan.nextDouble();
		
		g = st * (gr / 100);
		t = st + g;
		
		System.out.print("The gratuity is $" +g+ " and total is $" +t);

	}

}