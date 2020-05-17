package javaReviewroundt3;

public class practice {

	public static void main(String[] args) {

		int num[] = { 1, 12, 34, 56, 77, 88, 99, 7655 };
		int largest = num[0];
		int smalllest = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				largest = largest + num[i];
			} else if (num[i] < smalllest) {
				smalllest = smalllest + num[i];
			}
		}
		System.out.println(smalllest);
		System.out.println(largest);
	}
}
