package javaReviewRound2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		findDuplicateWords("hey java is java and java am learning");
		findDuplicateWords("jebril is very dedicated and hard worker and is quick learner ");
		findDuplicateWords("hi hi 200 100 200 100 200 1000 ");

	}

	public static void findDuplicateWords(String inputString) {
		// split
		// convert into []strings
		String words[] = inputString.split(" ");
		// 3cfreate hashmap
		Map<String, Integer> wordsCountMap = new HashMap<String, Integer>();
		// iterate map
		for (String word : words) {
			if (wordsCountMap.containsKey(word)) {
				wordsCountMap.put(word, wordsCountMap.get(word) + 1);
			} else {
				wordsCountMap.put(word, 1);
			}
		}

		Set<String> wordsInString = wordsCountMap.keySet();
		for (String name : wordsInString) {
			if (wordsCountMap.get(name) > 1) {
				System.out.println(name + " : " + wordsCountMap.get(name));
			}
		}

	}
}
