package Lab07;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public String toString() {
		return "" + numerator + "/" + denominator;
	}

	public void add(Fraction fraction) {
		int num = this.getNumerator() * fraction.getDenominator() + this.getDenominator() * fraction.getNumerator();
		int deno = this.getDenominator() * fraction.getDenominator();
		this.setNumerator(num);
		this.setDenominator(deno);
	}

	public void sub(Fraction fraction) {
		int num = this.getNumerator() * fraction.getDenominator() - this.getDenominator() * fraction.getNumerator();
		int deno = this.getDenominator() * fraction.getDenominator();
		this.setNumerator(num);
		this.setDenominator(deno);
	}

	public void multiplication(Fraction fraction) {
		int num = this.getNumerator() * fraction.getNumerator();
		int deno = this.getDenominator() * fraction.getDenominator();
		this.setNumerator(num);
		this.setDenominator(deno);
	}

	public void division(Fraction fraction) {
		int num = this.getNumerator() * fraction.getDenominator();
		int deno = this.getDenominator() * fraction.getNumerator();
		this.setNumerator(num);
		this.setDenominator(deno);
	}

}