package study;

import java.util.Scanner;

public class st0921 {

	public static void main(String[] args) {
		// 10개 입력
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		sort(arr1);
	}

	public static void sort(int[] arr1) {
		int temp = 0;
		for (int i = 0; i < 9; i++) {
			// 아 내림차순,,,
			for (int j = 0; j < 9; j++) {
				if (arr1[j] < arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
//			for (int j = 0; j < 9; j++) {
//				if (arr1[j] > arr1[j + 1]) {
//					temp = arr1[j];
//					arr1[j] = arr1[j + 1];
//					arr1[j + 1] = temp;
//				}
//			}
			for (int k = 0; k < 10; k++) {
				System.out.print(arr1[k] + " ");
			}
			System.out.println();
		}
	}

}
