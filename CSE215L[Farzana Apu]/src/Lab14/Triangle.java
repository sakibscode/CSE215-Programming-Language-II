package Lab14;

public class Triangle {
	int side1, side2, side3;

	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void checkThirdSide() throws IllegalTriangleException {

		int sum = side1 + side2;

		if (!(sum > side3)) {

			throw new IllegalTriangleException(
					"Sum of 2 sides " + side1 + " and " + side2 + " is not greater than third side " + side3);
		}
	}

	public static void main(String[] args) {

		try {

			Triangle triangle = new Triangle(10, 4, 34);

			triangle.checkThirdSide();
		} catch (IllegalTriangleException e) {
			System.out.println(e.getMessage());
		}

	}

}