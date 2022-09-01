package Mid;

public class Bicycle {

	private double weight;
	private double gears;
	private double maxSpeed;

	public Bicycle() {

	}

	public Bicycle(double weight, double gears) {
		this.weight = weight;
		this.gears = gears;

		this.maxSpeed = 0.85 * (this.gears / this.weight);
	}

	public Bicycle mergeBike(Bicycle b) {

		Bicycle b1 = new Bicycle();
		b1.weight = this.weight + b.weight;
		b1.gears = this.gears + b.gears;
		b1.maxSpeed = this.maxSpeed + b.maxSpeed;

		return b1;
	}

	public String toString() {
		return "Weight : " + this.weight + ", Gears:" + this.gears + ", Max Speed:" + this.maxSpeed;
	}

}