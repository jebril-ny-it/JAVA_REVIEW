package javaReview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = { "java", "javascript", "ruby", "c", "python", "java" };

		// 1. COMARE EACH ELEMENT: O(nxn)=o-nx-square--worst solution

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("duplicate element is  " + names[i]);
				}
			}
		}
		System.out.println("#############################");

		// 2.USING HASHSET:JAVA COLLECTION:IT STORES UNIQE VALUES;O(n)=time complexity
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("duplicate element is  " + name);
			}

		}
		System.out.println("#############################");

		// 3. USING HASHMAP O(2n)=time complexity
		Map<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);

			} else {
				storeMap.put(name, ++count);

			}
		}
		// get the values from this hashMap

		Set<Entry<String, Integer>> entryset = storeMap.entrySet();

		for(Entry<String, Integer> entry:entryset) {
			if(entry.getValue()>1) {
				System.out.println("this is the duplicate "+ entry.getKey());
			}
		}
	}

}
