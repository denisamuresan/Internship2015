package home;

public class Convertion {

	public static void stringToInt(String word) {
		int ascii;
		char lit;
		int number = 0;
		int nr = 0;
		int lung;
		boolean negativ = false;
		System.out.println("String: " + word);
		lung = word.length();

		if (word.charAt(0) == '-') {
			negativ = true;
		}

		for (int i = 0; i < word.length(); i++) {

			if (negativ == true && i != word.length() - 1) {
				i = i + 1;
			}
			lit = word.charAt(i);
			ascii = lit;

			if (ascii >= '0' && ascii <= '9') {
				number = number + (int) ((ascii - 48) * Math.pow(10, lung - 1 - i));

			}

			if (negativ == true) {
				nr = 0 - number;
			} else {
				nr = number;
			}
		}
		System.out.println("Number: " + nr);

	}
	public static void main(String[] args) {
		stringToInt("23");
		stringToInt("-40");

	}
}
