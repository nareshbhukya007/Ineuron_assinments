package com.ineuron.assignment2;

public class FindDuplicatesInArray {

	public static void main(String[] args) {

		// initialize array
		int[] arr = { 1,2,3,4,2,5,6,3,5,76 };
		System.out.println("Duplicate elements in given array: ");

		// searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}
