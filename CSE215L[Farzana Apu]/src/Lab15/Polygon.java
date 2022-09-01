package Lab15;

public abstract class Polygon {
	private int numSide;

	public Polygon() {

	}

	public Polygon(int numside) {
		this.numSide = numside;
	}

	public abstract double area();

	public void setnumSide(int side) {
		this.numSide = side;
	}

	public int getnumSide() {
		return numSide;
	}

	public abstract double perimeter();

}