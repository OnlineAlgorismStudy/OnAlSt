package year2020.month09;

import java.util.Scanner;

public class BR_0904 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 세 개의 정수를 전달받아 최대값을 구하여 리턴하는 함수를 작성하고
		 * 세 정수를 입력받아 최대값을 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * -10 115 33
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 115
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		System.out.println(getMax(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		
		sc.close();

	}
	
	private static int getMax(int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		return max;
	}

}
