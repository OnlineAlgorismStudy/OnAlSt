package homework;

import java.util.Scanner;

public class badak_0804 {

	/*
	 * 0803

10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.

-입력 예
A B C D E F G H I J
-출력 예
A D G
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] a = new String[10];
		
		for(int i = 0; i < 10 ; i++) {
			a[i] = sc.next();
		}
		sc.close();
		
		System.out.print(a[0]+" "+a[3]+" "+a[6]);
	}
}
