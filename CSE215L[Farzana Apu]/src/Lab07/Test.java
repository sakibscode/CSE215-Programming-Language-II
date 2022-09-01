package Lab07;

public class Test {

	public static void main(String[] args) {

		Fraction fraction1 = new Fraction(1, 4);
		Fraction fraction2 = new Fraction(3, 5);

		fraction1.add(fraction2);
		System.out.println("Addition on fraction1 : " + fraction1);

		Fraction fraction3 = new Fraction(2, 7);

		fraction1.sub(fraction3);
		System.out.println("Subtraction on fraction1 : " + fraction1);

		Fraction fraction4 = new Fraction(5, 6);

		fraction1.multiplication(fraction4);
		System.out.println("Multiplication on fraction1 : " + fraction1);

		Fraction fraction5 = new Fraction(2, 3);

		fraction1.division(fraction5);
		System.out.println("Division on fraction1 : " + fraction1);

	}

}