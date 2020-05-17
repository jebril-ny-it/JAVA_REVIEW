package javaReview;

public class SwapIntegarWithoutThirdVariable {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;

		// 1. WITH USING THIRD VARIABLE
//		int t;
//		t = x;// 5
//		x = y;// 10
//		y = t; // 5

		System.out.println("x is " + x);
		System.out.println("Y IS  " + y);

		// 2.WITHOUT USING TEMP VARIABLE:using + operator
//
//		x = x + y;// 15
//		y = x - y;// 5
//		x = x - y;// 10

		System.out.println("x is " + x);
		System.out.println("Y IS  " + y);

		// 3.WITHOUT USING TEMP VARIABLE:using x operator

//		x = x * y;// x = 50
//		y = x / y;// y = 5
//		x = x / y;// x = 10

		System.out.println("x is " + x);
		System.out.println("Y IS  " + y);

		// 4.USING XOR:^
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;

		System.out.println("x is " + x);
		System.out.println("Y IS  " + y);
	}

}
