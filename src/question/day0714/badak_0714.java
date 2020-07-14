package homework;

import java.util.Scanner;

public class badak_0714 {

	/*
	자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.

	- 입력 예
	5
	- 출력 예
	*
	**
	***
	****
	*****
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
