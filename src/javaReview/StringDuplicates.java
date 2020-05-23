package javaReview;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicates {

	public static void main(String[] args) {

		String inputString = "hello my my name is jay hello am learning java";

		String[] strArray = inputString.split("\\s");

		HashSet<String> set = new HashSet<String>();

		for (String arrayElement : strArray) {
			if (!set.add(arrayElement)) {
				System.out.println("Duplicate Element is : " + arrayElement);
			}
		}
		System.out.println("###############################");

		String pString = "i am am repeatring my my self";
		String parray[] = pString.split("\\s");
		Set<String> setp = new HashSet<String>();

		for (String name : parray) {
			if (!setp.add(name)) {
				System.out.println("duplicate: " + name);
			}
		}

	}

}
