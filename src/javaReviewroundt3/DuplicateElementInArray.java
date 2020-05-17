package javaReviewroundt3;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		String name[] = { "java", "c", "python", "javascript", "ruby", "java", "c" };
		//1. compare each element:O(nxn)o n square time complexity
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {

				if (name[i].equals(name[j])) {
					System.out.println("THIS IS MY DUPLICATE ELEMENT::" + name[i]);
				}
			}
		}

		System.out.println("#################3");
		
		//2.using HASHSET:java collection:store unique value
		Set<String> store = new HashSet<String>();
		for(String names: name) {
			if (store.add(names)==false) {
				System.out.println("THIS IS MY DUPLICATE ELEMENT::" + names);

			}
		}
		
		Set<String> store1 = new HashSet<String>();
		for(String names:name) {
			if (store1.add(names)==false) {
				System.out.println();
			}
		}
		
		
		
		
		
	}

}
