package year2020.month09;

import java.util.Scanner;

public class BR_0921 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 10개의 정수를 입력받아 버블 정렬로 내림차순 정렬을 하면서 하나의 단계가 끝날 때마다 그 정렬결과를 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 15 93 26 8 43 10 25 88 75 19
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 93 26 15 43 10 25 88 75 19 8
		 * 93 26 43 15 25 88 75 19 10 8
		 * 93 43 26 25 88 75 19 15 10 8
		 * 93 43 26 88 75 25 19 15 10 8
		 * 93 43 88 75 26 25 19 15 10 8
		 * 93 88 75 43 26 25 19 15 10 8
		 * 93 88 75 43 26 25 19 15 10 8
		 * 93 88 75 43 26 25 19 15 10 8
		 * 93 88 75 43 26 25 19 15 10 8
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[10];
		for (int i = 0; i < 10; i++) {
			ary[i] = sc.nextInt();
		}
		sc.close();
		
		printSortSteps(ary);
		
	}
	
	private static void printSortSteps(int[] ary) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9-i; j++) {
				if (ary[j] < ary [j+1]) {
					int tmp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = tmp;
				}
			}
			String step = "";
			for (int num : ary) {
				step += num + " ";
			}
			System.out.println(step.trim());
		}
	}
}
