package year2020.month09;

import java.util.Scanner;

public class BR_0907 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 10이하의 자연수 n을 입력받고 n개의 정수를 입력받아 내림차순으로 정렬하여 출력하는 프로그램을 작성하시오. (배열을 전달하는 함수를 이용한다.)
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
		
		System.out.println(getPower(sc.nextInt(), sc.nextInt()));
		
		sc.close();

	}
	
	private static int getPower(int num, int times) {
		return (int) Math.pow(num, times);
	}

}
