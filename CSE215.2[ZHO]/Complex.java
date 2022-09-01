package Assignment1;

public class Complex {

	double real, img;

	Complex() {
		real = 0;
		img = 0;
	}

	Complex(double a, double b) {
		real = a;
		img = b;
	}

	Complex(Complex c) {
		this.real = c.real;
		this.img = c.img;
	}

	Complex add(Complex c) {
		return new Complex(this.real + c.real, this.img + c.img);
	}
}