package home;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void breakingWords(String word, List<String> list) {
		System.out.print("The word is: " + word + ". 'WORD - BREAK': ");
		for (int i = 1; i < word.length(); i++) {
			for (String word1 : list) {
				if (word.substring(0, i).equals(word1)) {
					for (String word2 : list) {
						if (word.substring(i, word.length()).equals(word2)) {
							System.out.print(word1 + " " + word2);
					}
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream("C:\\Users\\denisa.muresan.THOR0\\Problem5\\cuv.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		List<String> list = new ArrayList<>();

		// Read File Line By Line
		System.out.println("Word List: ");
		while ((strLine = br.readLine()) != null) {
			list.add(strLine);
		}
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		breakingWords("applepie", list);

		br.close();

	}

}
