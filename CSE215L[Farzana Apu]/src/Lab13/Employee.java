package Lab13;

public class Employee {
	private String name;
	private String dept;
	protected double hourly_pay;

	public Employee(String name, String dept, double hourly_pay) {
		this.name = name;
		this.dept = dept;
		this.hourly_pay = hourly_pay;
	}

	public void set_dept(String dept) {
		this.dept = dept;
	}

	public void set_hourly_pay(double hourly_pay) {
		this.hourly_pay = hourly_pay;
	}

	public String get_employee_info() {
		return name + " is working in " + dept;
	}

	public double weekly_pay(int no_of_hours) {
		if (no_of_hours < 40)
			return hourly_pay * no_of_hours;
		else
			return 40.0 * hourly_pay;
	}

}