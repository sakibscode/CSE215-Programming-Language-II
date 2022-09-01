package Lab12;

public class Main {

	private static int index = 0;
	final static int size = 2;

	public static void add(Plant[] plants, Plant p) {
		if (index >= size)
			return;
		plants[index] = p;
		index++;
	}

	public static void remove(Plant[] plants, String n) {
		if (index > size)
			return;
		for (int i = 0; i < index; i++) {
			if (plants[i].getName().equals(n)) {
				for (int j = i; j < index - 1; j++)
					plants[j] = plants[j + 1];
				index--;
			}
		}
	}

	public static Plant search(Plant[] plants, String n) {
		for (int i = 0; i < index; i++) {
			if (plants[i].getName().equals(n)) {
				System.out.println("Plant Found...");
				return plants[i];
			}
		}
		return null;
	}

	public static void display(Plant[] plants) {
		for (int i = 0; i < index; i++)
			System.out.print(plants[i]);
	}

	public static void main(String[] args) {
		Plant[] plants = new Plant[size];
		Plant p;
		p = new Flower("Lily", "White");
		add(plants, p);
		p = new Herb("Mint", "Green");
		add(plants, p);
		System.out.print("Dispaly Plants: ");
		display(plants);
		System.out.println("\n\nSearch Mint...");
		System.out.print(search(plants, "Mint"));
		System.out.println("\nRemove Liliy... ");
		remove(plants, "Lily");
		System.out.println("Dispaly Plants: ");
		display(plants);
	}

}