package Lab09;

public class Main {

	public static void main(String[] args) {

		PartTimeEmployee pte = new PartTimeEmployee("Mark", 25, "23 Jump Street", "Finanace", "Accountant", 15, 250);
		FullTimeEmployee fte = new FullTimeEmployee("Clara", 23, "24 Jump Street", "RnD", "Resercher", 50000, 30);

		System.out.println("Part Time Employee Salary : $" + pte.salary());
		System.out.println("Full Time Employee Salaray : $" + fte.salary());
	}

}