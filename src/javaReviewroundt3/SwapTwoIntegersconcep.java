package javaReviewroundt3;

public class SwapTwoIntegersconcep {

	public static void main(String[] args) {

		int x = 5;
		int y = 15;

//		x = x + y;
//		y = x - y;
//		x = x - y;

		System.out.println(x);
		System.out.println(y);
		
		
		x = x ^ y ;
		y = x ^ y ;
		x = x ^ y ;
		
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		
		
		
	}

}
