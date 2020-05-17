package javaReviewRound2;

public class ReverseStringConcept {

	public static void main(String[] args) {

		//REVERSE A STRING:
		//DIFF BETWEEN STRING AND STRING BUFFER?
		//A.STRING IS IMUTUABLE
		//A.STRING BUFFER IS MUTUABLE
		//DO WE HAVE REVERSE FUNCYIOM IS STRING? 
		//A.NO
		String s = "selenium";
		System.out.println(s);
		String rev = "";
		int len = s.length();
		for(int i = len - 1; i>=0; i--) {
			rev = rev +s.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println("###################3");
		//practice
		
		String m = "name";
		System.out.println(m);
		String revm = "";
		int lenm = m.length();
		for(int i = lenm-1; i>=0;i--) {
			revm = revm + m.charAt(i);
		}
		System.out.println(revm);
		
		//2.String Buffer class
		String me = "learned java";
		StringBuffer sf = new StringBuffer(me);
		System.out.println(sf.reverse());
		
		
		
		
		
	}

}
