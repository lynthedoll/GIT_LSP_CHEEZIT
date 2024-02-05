package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordCounter {

	public static void main(String[] args) {
		String filepath = "src/org/howard/edu/lsp/assignment2/resources/words.txt";
		HashMap<String, Integer>wordCountMap = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String [] separated = line.split("[^a-zA-Z']+");
				for (String word : separated) {
					if (word.length() > 3 && !isNumeric(word.toLowerCase())) {
						wordCountMap.put(word.toLowerCase(), wordCountMap.getOrDefault(word.toLowerCase(), 0) + 1);
					}
				}
			}
			
			for (String word : wordCountMap.keySet()) {
				System.out.println(word + ":" + wordCountMap.get(word));
			}
		} catch (IOException e) {
			System.out.println("File not found in directory");
		}
	}

	private static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
