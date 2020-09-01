package year2020.month09;

import java.util.Scanner;

public class BR_0908 {

	private static int a = 0;
	private static int b = 0;

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 서로 다른 두 개의 정수가 주어진다.
		 * 두 정수를 입력받아 큰 수는 2로 나눈 몫을 저장하고 작은 수는 2를 곱하여 저장한 후 출력하는 프로그램을 작성하시오.
		 * (참조에 의한 호출을 이용한 함수를 작성하여 값을 수정하고 출력은 메인함수에서 한다.)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 100 500
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 200 250
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		BR_0908.a = sc.nextInt();
		BR_0908.b = sc.nextInt();
		
		while (BR_0908.a == BR_0908.b) {
			BR_0908.b = sc.nextInt();
		}
		
		sc.close();
		
		changeVal();
		System.out.println(BR_0908.a + " " + BR_0908.b);
	}
	
	private static void changeVal() {
		if (BR_0908.a > BR_0908.b) {
			BR_0908.a = (int) Math.floor(BR_0908.a/2);
			BR_0908.b = BR_0908.b * 2;
		}
		else {
			BR_0908.a = BR_0908.a * 2;
			BR_0908.b = (int) Math.floor(BR_0908.b/2);
		}
	}

}
