package javaReviewRound2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicateElementConcept {

	public static void main(String[] args) {

		String names[] = { "java", "javascript", "c", "python", "ruby", "ruby" };

		// COMPARE EACH ELEMENT
		// TIME COMPLEXCITY = O(nxn)-->o-n-square
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("this is the duplicate element: " + names[i]);
				}
			}
		}
		System.out.println("######## USING SET #########");

		// 2. USING HASHSET: JAVA COLLECTION:STORES UNIQUE VALUES: O(N) IS THE TIME
		// COMPLEXCITY

		Set<String> store = new HashSet<String>();

		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("this is the duplicate element: " + name);

			}
		}

		System.out.println("######## USING MAP #########");
		
		// 3.USING HASHMAP String ,Integer O(2n)best soloution
		Map<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}

		//GET THE VALUES FROM THIS HASHMAP:USING ENTRY SET
		Set<Entry<String, Integer>> entrySet = 	storeMap.entrySet();
		for(Entry<String, Integer>entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is:" +entry.getKey());
			}
		}
		
	}

}
