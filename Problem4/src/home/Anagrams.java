package home;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrams {

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

		FileInputStream fstream = new FileInputStream("C:\\Users\\denisa.muresan.THOR0\\Problem4\\text.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		int i = 0;
		String[] words = new String[10];
		// Read File Line By Line
		while ((strLine = br.readLine()) != null) {
			words[i] = strLine;
			i++;
		}
		for (int j = 0; j < i - 1; j++) {
			for (int k = 0; k < i; k++) {

				if ((isAnagram(words[j], words[k]) == true) && (words[j].compareTo(words[k])) != 0) {
					System.out.println("ANAGRAME: " + words[j] + " SI " + words[k] + ".");
				}

			}
		}
		br.close();

	}

}
