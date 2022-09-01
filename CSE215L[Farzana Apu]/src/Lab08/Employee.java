package Lab08;

public class Employee {
	private String name;
	private int joiningYear;
	private double salary;

	public Employee(String name, int joiningYear, double salary) {
		this.name = name;
		this.joiningYear = joiningYear;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getJoiningYear() {
		return joiningYear;
	}

	public double getSalary() {
		return salary;
	}

}   