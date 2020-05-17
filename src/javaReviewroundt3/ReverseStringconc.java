package javaReviewroundt3;

public class ReverseStringconc {

	public static void main(String[] args) {

		String s = "selenium";
		String rev = "";
		int len = s.length();
		for(int i = len -1; i>=0; i--) {
		rev = rev +	s.charAt(i);
		}
		
		System.out.println(rev);
		String s1 = "name";
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		System.out.println(sb);
	
	}

	
	
	
	
	
}
