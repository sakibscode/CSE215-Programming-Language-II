package Lab16;

public class Test {
	public static void main(String[] args) {
		BestForCustomer bfc = new BestForCustomer(10, 50);
		System.out.println("Best Possible Sales price $: " + bfc.discountedPrice(1000));
	}

}