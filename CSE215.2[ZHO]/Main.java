package Assignment1;

public class Main {

	public static void main(String[] args) {

		Complex c = new Complex(5, 8);
		Complex d = new Complex(2.5, 8.7);
		Complex e = d.add(c);
		System.out.println("New Complex Number is " + e.real + " + " + e.img + "i");
	}

}