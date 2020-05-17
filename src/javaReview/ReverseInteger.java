package javaReview;

public class ReverseInteger {

	public static void main(String[] args) {

		// HOW TO REVERSE AN INT
		// USING PROPER ALGERATHEM
		int num = 123456789;// 54321
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("reverse number is: " + rev);

		// 2.USING STRING BUFFER METHOD
		long num1 = 123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

		// practice
		int number = 56789;
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("practice reverse number = " + reverse);

		System.out.println("################ MORNING PRACTICE ##################");
		// practice
		int numP = 876543;
		int revP = 0;
		while (numP != 0) {
			revP = revP * 10 + numP % 10;
			numP = numP / 10;
		}
		System.out.println("practice reverse number = " + revP);

		System.out.println("################ MORNING PRACTICE ##################");
		// practice

		int n = 654321;
		int r = 0;
		while (n != 0) {
			r = r * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("practice reverse number = " + r);

		int Number = 54321;
		int Reverse = 0;

		while (Number != 0) {
			Reverse = Reverse * 10 + Number % 10;
			Number = Number / 10;
		}
		System.out.println("################ MORNING PRACTICE ##################");

		long numL = 1234567899;
		long revL = 0;

		while (numL != 0) {
			revL = revL * 10 + numL % 10;
			numL = numL / 10;
		}
		System.out.println(revL);
	
		
		//USING STRING BUFFER
		long num5 = 54321;
	
		System.out.println(new StringBuffer(String.valueOf(num5)).reverse());
		
		System.out.println("###### EVENING PRACTICE ########");
	
		int me = 123456789;
		int revme = 0;
		while (me !=0) {
			revme = revme*10 +me %10;
			me = me/ 10;
		}
	
		System.out.println(revme);
	}

}
