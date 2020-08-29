package homework;

import java.util.Scanner;

public class badak_0812 {

	/*
0812

10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.


-입력 예
10 20 25 66 83 7 22 90 1 100
-출력 예
odd : 141
even : 283
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [10];
		int odd = 0;
		int even = 0;
		for(int i = 0; i<10; i++) {
			a[i] = sc.nextInt();
			if(i%2==0) {
				odd += a[i];
			}else {
				even += a[i];
			}
		}
		System.out.println("odd : "+odd);
		System.out.println("even : "+even);
	}
}
