package javaReviewRound2;

//how to check is your string contains only digits
public class CheckNumeriConcept {

	public static boolean isEmpty(CharSequence cs) {
		return cs ==null || cs.length() == 0;
	}
	
	public static boolean isNumeric(CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}
		int len = cs.length();
		for(int i = 0; i< len ; i++) {
			if (! Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {


		System.out.println(isNumeric("abc123"));
		System.out.println(isNumeric(null));
		System.out.println(isNumeric(""));
	
	}

}
