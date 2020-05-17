package javaReviewRound2;

import java.util.Arrays;

public class SmallestAndLargestNumberConcept {

	// 1 for loop time complexcity is O(n)
	public static void main(String[] args) {

		int numbers[] = { 1, 12, 14, 67, 90 };

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			
			if (numbers[i]>largest) {
				largest = numbers[i];
			}else if (numbers[i]<smallest ) {
				smallest = numbers[i];
			}
		}

		System.out.println(" given array is" + Arrays.toString(numbers));
		System.out.println("smallest number is " + smallest);
		System.out.println("largest number is " + largest);

	}

}
