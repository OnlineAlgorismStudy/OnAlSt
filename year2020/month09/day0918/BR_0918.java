package year2020.month09;

import java.util.Scanner;

public class BR_0918 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 두 개의 정수를 입력받아 절대값이 더 큰 수를 출력하고 두 개의 실수를 입력받아 절대값이 작은 수를 출력하는 프로그램을 작성하시오. 실수는 소수점 이하 2자리까지 출력한다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * -50 40
		 * -12.34 5.67
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * -50
		 * 5.67
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		sc.close();
		
		System.out.println(getMax(a, b));
		System.out.println(getAbsMin(c, d));
	}
	
	private static int getMax(int a, int b) {
		return Math.max(Math.abs(a), Math.abs(b)) == Math.abs(a) ? a : b;
	}
	private static String getAbsMin(float a, float b) {
		return String.format("%.2f", Math.min(Math.abs(a), Math.abs(b)) == Math.abs(a) ? a : b);
	}

}
