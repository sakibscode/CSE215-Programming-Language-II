package Lab09;

public class PartTimeEmployee extends Employee {

	private double hours;
	private double rate;

	public PartTimeEmployee(String name, int age, String address, String department, String designation, double hours,
			double rate) {
		super(name, age, address, department, designation);
		setHours(hours);
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours > 23) {
			this.hours = 23;
			return;
		}
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double salary() {
		return rate * hours;
	}

}