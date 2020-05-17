package javaReviewroundt3;

public class SwapTwoStringsconcep {

	public static void main(String[] args) {

		String a  = "hello";
		String b = "world";
		System.out.println("BEFORE SWAPPING");
		System.out.println("value of b : "+a);
		System.out.println("value of b : "+b);
		
		a = a+b;
		b =a.replace(b, "");
		a = a.replace(b, "");
		System.out.println("value of b : "+a);
		System.out.println("value of b : "+b);
		
		
	}

}
