package study;

import java.util.Scanner;

public class st0929 {

	public static void main(String[] args) {
		final int length1 = 7;
		int[] arr1 = new int[length1];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		sort1(arr1);
	}

	public static void sort1(int[] arr1) {
		int temp = 0;
		for (int i = 0; i < arr1.length / 2; i++) {
			for (int j = 0; j < arr1.length - 1; j++) { // 10 7 5 3 20 12 5 => 6번 비교하니까 -1
				if (arr1[j] > arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

}
