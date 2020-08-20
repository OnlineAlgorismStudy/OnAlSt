package question.month08.day0821;

import java.util.Scanner;

public class bangJjo_0821 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr1 = new int[2][4];
		int[][] arr2 = new int[2][4];
		int[][] result = new int[2][4];

		// 첫 번째 배열에 입력 받음
		System.out.println("first array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				arr1[i][j] = sc.nextInt();
			} // end for
		} // end for

		// 두 번째 배열에 입력 받음
		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				arr2[i][j] = sc.nextInt();
			} // end for
		} // end for

		// 출력
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				result[i][j] = arr1[i][j] * arr2[i][j];

				System.out.print(result[i][j] + " ");
			} // end for
			System.out.println();
		} // end for
		sc.close();
	} // main

} // class
