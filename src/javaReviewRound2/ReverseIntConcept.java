package javaReviewRound2;

public class ReverseIntConcept {

	public static void main(String[] args) {

		int num = 12345;
		int rev = 0;
		while (num !=0) {
			rev = rev*10 +num %10;
			num = num/10;
		}
	System.out.println(rev);
	
	int number = 12345678;
	int reverse = 0;
	System.out.println(number);
	while(number !=0) {
		reverse = reverse *10 +number %10;
		number = number/10;
	}
	System.out.println(reverse);
	
	long num1 = 123456789;
	System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	
	System.out.println("###### PRACTICE ######");
	
	int n = 12345;
	int r = 0;
	while(n !=0) {
		r = r *10 +n %10;
		n = n/10;
	}
	System.out.println(r);
	
	System.out.println(new StringBuffer(String.valueOf(n)).reverse());
	
	}

	
	
	
}
