package Lec1;
import java.util.Scanner;

public class FindLargerNo {

	public static void main(String[] args) {
		int a, b;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a>b) {
			System.out.print("Larger number : " +a);
		}
		else {
			System.out.print("Larger number : " +b);
		}

	}

}
