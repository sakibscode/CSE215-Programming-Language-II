package Lab05;

public class HT01 {

	public static void main(String[] args) {
		HT01 obj = new HT01();
		obj.intchar(5, 'A');
		obj.intchar('A', 5);

	}

	void intchar(int n, char c) {
		System.out.println("n : " + n + ", c : " + c);
	}

	void intchar(char c, int n) {
		System.out.println("c : " + c + ", n : " + n);
	}

}