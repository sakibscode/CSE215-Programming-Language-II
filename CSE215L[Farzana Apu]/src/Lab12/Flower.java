package Lab12;

public class Flower extends Plant {
	private boolean hasSmell;
	private boolean hasThorn;

	public Flower(String name, String color) {
		super(name, color);
	}

	public boolean isHasSmell() {
		return hasSmell;
	}

	public void setHasSmell(boolean hasSmell) {
		this.hasSmell = hasSmell;
	}

	public boolean isHasThorn() {
		return hasThorn;
	}

	public void setHasThorn(boolean hasThorn) {
		this.hasThorn = hasThorn;
	}

	@Override
	public String toString() {
		return "Flower: hasSmell=" + hasSmell + ", hasThorn=" + hasThorn;
	}

}