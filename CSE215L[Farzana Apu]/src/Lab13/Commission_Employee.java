package Lab13;

public class Commission_Employee extends Employee {
	private double commission_rate;
	private double sales_amount;

	public Commission_Employee(String name, String dept, double hourly_pay, double commission_rate) {
		super(name, dept, hourly_pay);
		this.commission_rate = commission_rate;
	}

	public void set_commission_rate(double commission_rate) {
		this.commission_rate = commission_rate;
	}

	public void set_sales_amount(double sales_amount) {
		this.sales_amount = sales_amount;
	}

	public double weekly_pay(int no_of_hours) {
		return super.weekly_pay(no_of_hours) + sales_amount * commission_rate;
	}

}