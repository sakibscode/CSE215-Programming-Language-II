package Lab16;

public class BestForCustomer implements Discountable {
	private double percentage;
	private double threshold;
	private double discount;

	public BestForCustomer(double percentage, double threshold) {
		super();
		this.percentage = percentage;
		this.threshold = threshold;
	}

	public double getPercentage() {
		return percentage;
	}

	public double getThreshold() {
		return threshold;
	}

	public double getDiscount() {
		return discount;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public double discountedPrice(double price) {
		double val = percentage * price;
		if (val > threshold) {
			val = threshold;
		}
		this.discount = val;
		return price - val;
	}

}