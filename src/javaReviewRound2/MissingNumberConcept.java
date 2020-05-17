package javaReviewRound2;

public class MissingNumberConcept {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 6, 7, 8 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= 8; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println(sum1 - sum);

		System.out.println("####### PRACTICE ######");

		int b[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int sumb = 0;
		for (int i = 0; i < b.length; i++) {
			sumb = sumb + b[i];
		}
		System.out.println(sumb);
		int sumb1 = 0;
		for (int j = 1; j <= 9; j++) {
			sumb1 = sumb1 + j;
		}
		System.out.println(sumb1);
		System.out.println(sumb1 - sumb);

		System.out.println("####### PRACTICE PART2 ######");

		int x[] = { 1, 2, 3, 4, 5, 6, 7, 9 };

		int sumx = 0;
		for(int i = 0; i<x.length; i++) {
			sumx = sumx +x[i];
		}
		int sumx1 = 0;
		for(int j = 1; j<=9;j++) {
			sumx1 = sumx1 +j;
		}
		System.out.println(sumx1 - sumx);
		}
}
