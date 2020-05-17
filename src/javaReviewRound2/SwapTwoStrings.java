package javaReviewRound2;

public class SwapTwoStrings {

	public static void main(String[] args) {

		
		String a = "hello";
		String b = "world"; 
		System.out.println("BEFORE SWAPPING");
		System.out.println("THE VALUE OF A IS : "+a);
		System.out.println("THE VALUE OF B IS : "+b);
		
		a = a+b;
		b = a.replace(b, "");
		a = a.replace(b, "");
		System.out.println("THE VALUE OF A IS : "+a);
		System.out.println("THE VALUE OF B IS : "+b);
		
		String s1 = "name";
		String s2 = "jackie";
		System.out.println("BEFORE SWAPPING");
		System.out.println("THE VALUE OF S1 IS : "+s1);
		System.out.println("THE VALUE OF S2 IS : "+s2);
		//1.append s1 and s2
		s1 = s1 +s2;
		
		//2.store initial string s1 into string s2
		s2 = s1.substring(0, s1.length()-s2.length());
		
		//3. sore initial string s2 into s1
		s1 = s1.substring(b.length());
		System.out.println("THE VALUE OF S1 IS : "+s1);
		System.out.println("THE VALUE OF S2 IS : "+s2);
		
		
		
		
	}

}
