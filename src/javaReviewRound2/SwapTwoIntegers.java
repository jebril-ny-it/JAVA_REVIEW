package javaReviewRound2;

public class SwapTwoIntegers {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		// using arethmatics
//		x = x + y;// 15
//		y = x - y;// 5
//		x = x - y;// 10
		System.out.println("before swap");
		System.out.println(x);
		System.out.println(y);

		// with using temp variable

		int t;
		t = x;// 5
		x = y;// 10
		y = t;// 5
		System.out.println("after swap");
		System.out.println(x);
		System.out.println(y);

		// 3.using * operator
		x = x * y;// 50
		y = x / y; // 5
		x = x / y;// 10

		// 4. using zor (^) operator:
		x = x ^ y;//15 -->1111
		y = x ^ y;//10 -->1010
		x = x ^ y;//5 -->0101
		

	}

}
