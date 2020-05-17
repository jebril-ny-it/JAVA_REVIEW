package javaReviewRound2;

public class RemoveJunkConcept {

	public static void main(String[] args) {
		//regular expression [^]

		String s = "!@#$$#@! JAVA LEARNING 1000 !@#$%$#@";
		s = s.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s);
	}

}
