package Lab08;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee("John", 2018, 1800);
		Employee emp2 = new Employee("Anna", 2020, 1600);
		Employee emp3 = new Employee("Sara", 2015, 2200);

		System.out.println("Name: " + emp1.getName());
		System.out.println("Year of joining: " + emp1.getJoiningYear());
		System.out.println("Salary: " + emp1.getSalary());

		System.out.println("\nName: " + emp2.getName());
		System.out.println("Year of joining: " + emp2.getJoiningYear());
		System.out.println("Salary: " + emp2.getSalary());

		System.out.println("\nName: " + emp3.getName());
		System.out.println("Year of joining: " + emp3.getJoiningYear());
		System.out.println("Salary: " + emp3.getSalary());
	}

}