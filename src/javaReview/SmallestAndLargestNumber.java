package javaReview;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {

		int numbers[] = { -100, 24, 50, -88, 98767, 98768 };

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("\n given array is:: " + Arrays.toString(numbers));
		System.out.println("largest number is  " + largest);
		System.out.println("smallest number is  " + smallest);

		int n[] = { 1, 5, 8, 9, 19, 34, 56, 78, 99 };

		int larg = n[0];
		int smal = n[0];
		
		for(int i = 1 ; i<n.length; i++) {
			if(n[i]>larg) {
				larg = n[i];			
				
			}else if (n[i]<smal ) {
				smal = n[i];			}
		
		}
		
	}

}
