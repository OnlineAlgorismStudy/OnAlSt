package homework;

import java.util.Scanner;

public class badak_0721 {

	/*
	자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.
	
	- 입력 예
	3
	- 출력 예
	1 2 3 A
	4 5 B C
	6 D E F
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int num = 1;
		char eng = 65;
		for(int i = 0; i < a; i++ ) {
			for(int j = i; j <a ;j++) {
				System.out.print(num+" ");
				num += 1;
			}
			for(int j = 0;j <= i;j++) {
				System.out.print(eng+" ");
				eng += 1;
			}
			System.out.println("");
		}
	}
}
