package javaReview;

public class MissingNumber {

	public static void main(String[] args) {

		// int a [] = {1,2,4,5};
		// FIRST ADD ALL THE NUMBERS
		// 1+2+4+5=12
		// 1+2+3+4+5=15
		// 15-12=3-->3 ia the missing number

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 9 };

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= 9; j++) {
			sum1 = sum1 + j;
		}

		System.out.println(sum1);
		System.out.println("the missing number is:::" + (sum1 - sum));

		System.out.println("######## MORNING  PRACTICE");
		int b[] = { 2, 3, 4, 5, 6, 7, 8, 9 };

		int sumb = 0;
		for (int i = 0; i < b.length; i++) {
			sumb = sumb + b[i];
		}

		System.out.println(sumb);
		int sumb2 = 0;
		for (int j = 1; j <= 9; j++) {
			sumb2 = sumb2 + j;

		}
		System.out.println(sumb2);
		System.out.println(sumb2 - sumb);

		System.out.println("######## EVENING  PRACTICE");

		int f[] = { 1, 2, 3, 4, 5, 6, 7, 9 };

		int sumf = 0;
		for (int i = 0; i < f.length; i++) {
			sumf = sumf + f[i];
		}
		System.out.println(sumf);
		int sumf2 = 0;

		for (int j = 1; j < 10; j++) {
			sumf2 = sumf2 + j;
		}

		System.out.println(sumf2);
		System.out.println(sumf2 - sumf);

	}

}
