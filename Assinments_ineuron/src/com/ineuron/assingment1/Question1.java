package com.ineuron.assingment1;


public class Question1 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == n / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 || i == n / 2 || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			for (int j = 0; j < n; j++) {
				if (j == 0 && i <= (3 * n) / 4 || j == n - 1 && i <= (3 * n) / 4 || i == n - 1 && j > 0 && j < n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == j && j > n / 4 || j == (3 * n) / 4 && i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			for (int j = 0; j < n; j++) {
				if (j == 0 && i!=0 && i!=n-1  || j == n - 1 && i!=0 && i!=n-1 || j==1 && i<n/4 ||j==3 && i<n/4 ||
						j==1 && i>(3*n)/4 || j==3 && i>(3*n)/4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
