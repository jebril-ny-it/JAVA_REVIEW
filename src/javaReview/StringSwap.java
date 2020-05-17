package javaReview;

public class StringSwap {

	public static void main(String[] args) {

		// WAY TO SWAP STRINGS WITHOUT USING TEMP/THIRD VARIABLE

		String a = "hello";
		String b = "world";

		System.out.println("BRFORE SWAPPING: ");
		System.out.println("THE VALUE OF a: " + a);
		System.out.println("RHE VALUE OF b: " + b);

		// 1.append a and b
		a = a + b;// helloWorld

		// 2.store initial string a in string b
		b = a.substring(0, a.length() - b.length());

		// 3.store initial string b in string a
		a = a.substring(b.length());

		System.out.println("THE VALUE OF A AND B AFTER SWAPPING");
		System.out.println("THE VALUE OF a: " + a);
		System.out.println("RHE VALUE OF b: " + b);

		
		//2. way
		String s1 = "Jebril";
		String s2 = "mohammad";
		System.out.println("BRFORE SWAPPING: ");
		System.out.println(s1);
		System.out.println(s2);
		s1 = s1 + s2;
		s2 = s1.replaceAll(s2, "");
		s1 = s1.replaceAll(s2, "");
		System.out.println(" AFTER SWAPPING");
		System.out.println(s1);
		System.out.println(s2);
		
		//PRACTICE
		String m1 = "master";
		String m2 = "automation";
		m1 = m1 +m2;
		//master automation
		m2= m1.replaceAll(m2, "");
		//master
		m1 = m1.replaceAll(m2, "");
		//automation
		System.out.println(m1);
		System.out.println(m2);
		
	
		//needs more practice
		String f1 = "akbar";
		String f2 = "allah";
		f1=f1+f2;
		f2 = f1.replaceAll(f2, "");//allah-->aknar--replaces f2 with f1
		f1 = f1.replace(f2, "");//f1 = akbarallh-->allah
		
		System.out.println(f1);
		System.out.println(f2);
		
		
	}

}
