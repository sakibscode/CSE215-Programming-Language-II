package Class2;

public class Task2 {

	public static void main(String[] args) {
		double kilometers = 14;
		double miles = kilometers / 1.6;
		
		double rate = (45 * 60.0 + 30) / (60.0 * 60.0);
		double MPH = miles / rate;
		
		System.out.println("Average speed in mailes per hour : " +MPH);

	}

}