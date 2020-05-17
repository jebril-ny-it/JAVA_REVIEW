package javaReviewroundt3;

public class RemoveJunkconcep {

	public static void main(String[] args) {

		String s = "!@#$#@!!@# JEBRIL2020 @!@#$#@!#";
		s = s.replaceAll("[^a-z A-Z0-9]", "");
		System.out.println(s);
	}

}
