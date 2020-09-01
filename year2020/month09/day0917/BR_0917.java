package year2020.month09;

import java.util.Scanner;

public class BR_0917 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 10 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 내림차순으로 정렬하여 출력하는 프로그램을 작성하시오. (배열을 전달하는 함수를 이용한다.)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 4
		 * 10 9 2 15
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 15 10 9 2
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		while (size < 1 || size > 10) size = sc.nextInt();
		int[] ary = new int[size];
		
		for (int i = 0; i < size; i++) {
			ary[i] = sc.nextInt();
		}
		sc.close();
		
		String strAry = "";
		for (int i : sortDesc(ary)) {
			strAry += i + " ";
		}
		System.out.println(strAry.trim());
	}
	
	private static int[] sortDesc(int[] ary) {
		for (int i = 0; i < ary.length-1; i++) {
			for (int j = i+1; j < ary.length; j++) {
				if (ary[i] < ary[j]) {
					int tmp = ary[i];
					ary[i] = ary[j];
					ary[j] = tmp;
				}
			}
		}
		return ary;
	}

}
