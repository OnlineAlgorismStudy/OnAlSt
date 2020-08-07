package homework;

import java.util.Scanner;

public class badak_0807 {

	/*
	 * 0807
	 * 
	 * 10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
	 * 
	 * (입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
	 * 
	 * 
	 * -입력 예 88 123 659 15 443 1 99 313 105 48 -출력 예 99 105
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];
		int max = 0;
		int min = 10000;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] < 100) {
				max = a[i] > max ? a[i] : max;
			} else {
				min = a[i] < min ? a[i] : min;
			}
		}
		if (max == 0) {
			max = 100;
		}
		if (min == 10000) {
			min = 100;
		}
		System.out.println(max + " " + min);
	}
}
