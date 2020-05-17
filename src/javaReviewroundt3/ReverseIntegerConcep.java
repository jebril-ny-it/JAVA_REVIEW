package javaReviewroundt3;

public class ReverseIntegerConcep {

	public static void main(String[] args) {

		int number =12345;
		int rev = 0;
		while(number != 0) {
			rev = rev *10 +number %10;
			number = number/10;
		}
		System.out.println(rev);
	
		
		int n = 54321;
		int r = 0;
		while(n !=0) {
			r = r *10 +n %10;
			n = n/10;
		}
		System.out.println(r);
		
		int m = 123456789;
		System.out.println(new StringBuffer(String.valueOf(m)));
	}

}
