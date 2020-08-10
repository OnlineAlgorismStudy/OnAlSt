package homework;

import java.util.Scanner;

public class badak_0810 {

	/*
	 * 0810
	 * 
	 * 10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
	 * 평균은 반올림하여 소수첫째자리까지 출력한다.
	 * 
	 * 
	 * -입력 예 95 100 88 65 76 89 58 93 77 99 -출력 예 sum : 446 avg : 78.8
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if ((i + 1) % 2 == 0) {
				sum += a[i];
			} else {
				avg += a[i];
			}
		}
		avg = avg / 5;
		System.out.println("sum : " + sum + "\navg : " + Math.round(avg * 10) / 10.0);
	}
}
