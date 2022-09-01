package Lab15;

public class Triangle extends Polygon {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(int side, double sidea, double sideb, double sidec) {
		super.setnumSide(side);
		this.sideA = sidea;
		this.sideB = sideb;
		this.sideC = sidec;

	}

	public double area() {
		return Math.abs((sideA * sideB * Math.sin(sideC)) / 2);
	}

	public double perimeter() {
		return (sideA + sideB + sideC);
	}

	public String toString() {
		return ("The area is : " + area() + " \nThe perimeter is : " + perimeter());

	}

}