package year2020.month09;

import java.util.Scanner;

public class BR_0915 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 두 개의 음이 아닌 정수를 입력받아 큰 수의 제곱에서 작은 수의 제곱을 뺀 결과값을
		 * 출력하는 프로그램을 작성하시오.
		 * (두 정수를 전달받아 제곱의 차를 리턴하는 함수를 이용할 것)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 8 10
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 36
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		int temp1 = sc.nextInt();
		int temp2 = sc.nextInt();
		
		while (temp1 < 0) {
			temp1 = sc.nextInt();
		}
		while (temp2 < 0) {
			temp2 = sc.nextInt();
		}
		
		System.out.println(getSquaredDiff(Math.max(temp1, temp2), Math.min(temp1, temp2)));
		
		sc.close();
	}
	
	private static int getSquaredDiff(int big, int small) {
		return (int)Math.pow(big, 2) - (int)Math.pow(small, 2);
	}

}
