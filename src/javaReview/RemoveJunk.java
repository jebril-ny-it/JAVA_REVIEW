package javaReview;

public class RemoveJunk {

	public static void main(String[] args) {

		// HOW WILL YOU REMOVE UNWANTED CHARACTERS
		// REPLACE ALL METHOD
		// REGULAR EXPRESSION:[^A-ZA-Z0-9]

		String s = "*&^%^&* Lating String 01234567890";
		String s1 = "$#@#$#@#$ testing %$#@#$% Selenium #@!@#$%$#@ Java";

		// REGULAR EXPRESSION:[^A-ZA-Z0-9]

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		s1 = s1.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s1);

		System.out.println("$############################################");
		// morning practice

		String Kifah = "@#!$%#%$#@ Learned Java &%$#@!@#$";

		Kifah = Kifah.replaceAll("[^a-z A-Z]", "");
		System.out.println(Kifah);

		System.out.println("$################### EVENING PRACTICE #########################");

		
		String j ="!@#$%%$#@! practiice !@#$";
		j = j.replaceAll("[^a-z A-Z]", "");
		System.out.println(j);
			
	}
}
