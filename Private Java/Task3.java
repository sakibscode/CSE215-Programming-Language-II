package Class2;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		double speed, acceleration, length;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration : ");
		speed = scan.nextDouble();
		acceleration = scan.nextDouble();
		
		length = (speed * speed) / (2 * acceleration);
		
		System.out.printf("The minimum runway length for this airplane is : %.3f\n", length);

	}

}