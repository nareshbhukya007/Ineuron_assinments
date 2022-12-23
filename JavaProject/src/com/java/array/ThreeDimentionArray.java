package com.java.array;

import java.util.Scanner;

public class ThreeDimentionArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaration of an 3d Array
		int[][][] ar = new int[2][3][3];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				for (int k = 0; k < ar[i][j].length; k++) {
					System.out.println("please enter the marks of the college " + i + " class " + j + " students " + k);
					ar[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("The marks stored are as follows");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				for (int k = 0; k < ar[i][j].length; k++) {
					System.out.print(ar[i][j][k] + " ");
				}
				System.out.println();
			}

		}

	}

}
