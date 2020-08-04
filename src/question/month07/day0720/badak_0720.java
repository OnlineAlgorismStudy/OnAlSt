package homework;

import java.util.Scanner;

public class badak_0720 {

	/*
	0720

	자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.

	- 입력 예
	3
	
	- 출력 예
	ABC
	DE
	F
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int result = 65;
		for (int i = 0; i < a; i++) {
			for(int j = i; j < a; j++) {
				System.out.print((char)result);
				result += 1;
			} 
			System.out.println("");
		}
	}
}
