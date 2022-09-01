package Lab13;

public class Main {

	public static void main(String[] args) {
		Union_Employee UE = new Union_Employee("Kumar", "ECE Dept", 8, 10);
		Commission_Employee CE = new Commission_Employee("Ravi", "EEE Dept", 9, 10);
		CE.set_sales_amount(5.0);
		for (int input = 35; input <= 45; input += 5) {
			display(UE, input);
			display(CE, input);
		}
	}

	public static void display(Employee E, int no_of_hours) {
		System.out.print(E.get_employee_info());
		System.out.println(" Weekly Pay off given by " + E.weekly_pay(no_of_hours));
	}

}