package Lab12;

public class Herb extends Plant {
	private boolean isMedicinal;
	private String season;

	public Herb(String name, String color) {
		super(name, color);
	}

	public boolean isMedicinal() {
		return isMedicinal;
	}

	public void setMedicinal(boolean isMedicinal) {
		this.isMedicinal = isMedicinal;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "Herb: isMedicinal=" + isMedicinal + ", season=" + season;
	}

}