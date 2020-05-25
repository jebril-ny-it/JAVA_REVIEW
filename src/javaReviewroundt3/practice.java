package javaReviewroundt3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class practice {

	public static void main(String[] args) {

		DuplicateWords("hi hi hihi hi hih ih hi hi hi hi hi hi ");
		duplicatewordsSet("hello hello helllo hello");
		using2forLoops("hello usinf 2 for loops 2 for loops");

	}

	public static void DuplicateWords(String outputString) {

		String words[] = outputString.split("\\s");
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		for (String word : words) {
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

	public static void duplicatewordsSet(String setOUtput) {
		String words[] = setOUtput.split(" ");

		Set<String> duplicatewords = new HashSet<String>();
		for (String word : words) {
			if (duplicatewords.add(word) == false) {
				System.out.println("duplicate set word: " + word);
			}
		}

	}
	
	public static void using2forLoops(String forLoopString) {
		String words[] = forLoopString.split(" ");
		for(int i = 0 ; i < words.length; i++) {
			for(int j = i+1;j<words.length;j++) {
				if (words[i].equals(words[j])) {
					System.out.println("for loop duplicate is: "+words[i]);
				}
			}
		}
	}

}
