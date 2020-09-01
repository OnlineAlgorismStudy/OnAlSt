package year2020.month09;

import java.util.Scanner;

public class BR_0929 {
	final static int CNT = 7;

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자료의 개수 7을 매크로 상수로 정의하여 자료의 개수만큼 정수를 입력받아
		 * 입력받은 순서대로 앞에서부터 마지막까지 가면서 바로 뒤의 숫자와 비교하여 크면 교환한다.
		 * 이러한 작업을 세 번 반복한 후 그 결과를 하나의 행에 공백으로 구분하여 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 15 20 41 8 26 33 19
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 8 15 20 19 26 33 41
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[CNT];
		for (int i = 0; i < CNT; i++) {
			numbers[i] = sc.nextInt();
		}
		
		sc.close();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < CNT-1-i; j++) {
				if (numbers[j] > numbers[j+1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
				}
			}
		}
		
		String result = "";
		for (int number : numbers) {
			result += number + " ";
		}
		System.out.println(result.trim());
	}
	
	
}
