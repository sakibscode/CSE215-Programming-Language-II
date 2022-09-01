package Mid;

public class Three {

	public static void main(String[] args) {

		String fullName = "Ziaul;Hossain";
		int separatorPosition = fullName.indexOf("'") + 1;
		System.out.println(fullName.substring(separatorPosition));

	}

}