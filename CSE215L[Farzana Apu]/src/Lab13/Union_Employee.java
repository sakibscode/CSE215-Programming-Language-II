package Lab13;

public class Union_Employee extends Employee {
	private double dues;

	public Union_Employee(String name, String dept, double hourly_pay, double dues) {
		super(name, dept, hourly_pay);
		this.dues = dues;
	}

	public void set_dues(double dues) {
		this.dues = dues;
	}

	public double weekly_pay(int no_of_hours) {
		double pay = 0;
		if (no_of_hours < 40)
			pay = super.weekly_pay(no_of_hours);
		else
			pay = super.weekly_pay(no_of_hours) + (no_of_hours - 40) * hourly_pay * 1.5;
		return pay - dues;
	}

}