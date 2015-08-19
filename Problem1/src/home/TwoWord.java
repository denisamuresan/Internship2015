package home;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TwoWord {

	public static boolean isAnagram(String word1, String word2) {
		int i;
		if (word1.length() != word2.length()) {
			return false;
		}
		char[] letters = word1.toCharArray();
		for (char c : letters) {
			i = word2.indexOf(c);
			if (i != -1) {
				word2 = word2.substring(0, i) + word2.substring(i + 1, word2.length());

			} else {
				return false;
			}
		}

		return word2.isEmpty();
	}

	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream("C:\\Users\\denisa.muresan.THOR0\\Problem1\\cuv.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		List<String> dictionary = new ArrayList<>();
		String cuv;

		// Read File Line By Line
		System.out.println("Word List: ");
		while ((strLine = br.readLine()) != null) {
			dictionary.add(strLine);
		}
		for (String s : dictionary) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		for (String cuv1 : dictionary) {
			cuv = "";
			for (String cuv2 : dictionary) {
				cuv = cuv1 + cuv2;
				if (isAnagram(cuv, "documenting")) {
					System.out.println("TWO-WORD: "+cuv1+" / "+cuv2);
				}
			}
		}

		br.close();

	}

}
