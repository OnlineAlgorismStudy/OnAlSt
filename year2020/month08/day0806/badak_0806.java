package homework;

import java.util.Scanner;

public class badak_0806 {

	/*
	 * 0806
	 * 
	 * 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
	 * 
	 * 
	 * -입력 예 5 10 8 55 6 31 12 24 61 2 -출력 예 2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (i == 0) {
				result = a[i];
			} else if (a[i] < result) {
				result = a[i];
			}
		}
		sc.close();

		System.out.println(result + "");
	}
}
