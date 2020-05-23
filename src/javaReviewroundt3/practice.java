package javaReviewroundt3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class practice {

	public static void main(String[] args) {

		String s[] = { "java", "c", "money", "more money", "more money", "java" };

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.println("duplicate using 2 for loops: " + s[i]);
				}
			}
		}

		Set<String> words = new HashSet<String>();
		for (String word : s) {
			if (words.add(word) == false) {
				System.out.println("duplicate using set: " + word);
			}
		}

		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		for (String word : s) {
			if (wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}

		Set<String> wordsInString = wordCountMap.keySet();
		for (String word : wordsInString) {
			if (wordCountMap.get(word) > 1) {
				System.out.println(word + ":" + wordCountMap.get(word));
			}
		}

	}

}
