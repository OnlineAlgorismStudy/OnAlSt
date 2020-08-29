package homework;

import java.util.Scanner;

public class badak_0804 {

	/*
	 * 0804
	 * 
	 * 100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 가장
	 * 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
	 * 
	 * -입력 예 3 5 10 55 0 -출력 예 55 10 5 3
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[100];

		int i = 0;
		while (true) {
			a[i] = sc.nextInt();
			if (a[i] == 0) {
				for (int j = i - 1; j >= 0; j--) {
					System.out.print(a[j] + " ");
				}
				break;
			}
			i++;
		}
		sc.close();
	}
}
