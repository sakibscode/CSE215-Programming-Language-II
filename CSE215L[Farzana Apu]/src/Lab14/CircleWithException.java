package Lab14;

import java.util.Scanner;

public class CircleWithException {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws IllegalArgumentException {

		if (radius < 0) {
			throw new IllegalArgumentException("Radius cannot be negative");
		} else {
			this.radius = radius;
		}

	}

	public double getArea() throws Exception {
		double area = Math.PI * radius * radius;

		if (area > 2000) {
			throw new Exception("area cannot be bigger than 2000");
		}
		return area;

	}

	public double getDiameter() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Create a circle for radius ");
		int radius[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.printf("Enter radius of %d cicle: ", i + 1);
			radius[i] = input.nextInt();
		}
		for (int i = 0; i < 3; i++) {

			try {

				CircleWithException circle1 = new CircleWithException();
				circle1.setRadius(radius[i]);
				System.out.println("Radius: " + circle1.getRadius());
				System.out.println("Area: " + String.format("%.2f", circle1.getArea()));
			} catch (IllegalArgumentException e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				System.out.println("this is from finally\n");

			}
		}

	}

}