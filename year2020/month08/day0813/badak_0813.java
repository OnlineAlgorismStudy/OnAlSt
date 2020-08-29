package homework;

import java.util.Scanner;

public class badak_0813 {

	/*
	 * 0813
	 * 
	 * 세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고 그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을
	 * 작성하시오.입력받는 정수는 100개 이하이다.
	 * 
	 * 
	 * -입력 예 45 19 123 58 10 -55 16 -1 999 -출력 예 max : 123 min : -55
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int max = 0;
		int min = 0;
		for (int i = 0; i < 100; i++) {
			a[i] = sc.nextInt();
			if (a[i] == 999) {
				break;
			} else if (i == 0) {
				max = a[i];
				min = a[i];
			} else {
				max = a[i] > max ? a[i] : max;
				min = a[i] < min ? a[i] : min;
			}
		}
		sc.close();
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
