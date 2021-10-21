package Class2;
import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		double KPP = 0.45359237, MPI = 0.0254, weight, height, BMI;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds : ");
		weight = scan.nextDouble();
		
		System.out.print("Enter height in inches : ");
		height = scan.nextDouble();
		
		weight = weight * KPP;
		
		height = height * MPI;
		
		BMI = weight / Math.pow(height, 2);
		
		System.out.printf("BMI is : %.4f", BMI);

	}

}