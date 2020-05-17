package javaReviewroundt3;

import java.util.Arrays;

public class SmallestToLargestNumberInt {

	public static void main(String[] args) {

		int num[] = { -1, 4, 7, 5, 9, -88, 66, 43, 4, 3 };
		int largest = num[0];
		int smallest = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largest) {
				largest = largest + num[i];
			} else if (num[i] < smallest) {
				smallest = smallest + num[i];
			}
		}
		System.out.println(" GIVEN ARRAY IS\n " + Arrays.toString(num));
		System.out.println("THIS IS THE SMALLEST NUMBER " + smallest);
		System.out.println("THIS IS MY LARGEST NUMBER " + largest);
	}
}
