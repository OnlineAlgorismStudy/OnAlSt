package homework;

import java.util.Scanner;

public class badak_0727 {

	/*
자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.

- 입력 예
3
- 출력 예
     1    
   1 2
 1 2 3
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		for(int i = 0; i<a ;i++) {
			for(int j = i+1; j<a;j++) {
				System.out.print("  ");
			}
			for(int j = 0 ; j<=i; j++) {
				System.out.print(" "+(j+1));
			}
			System.out.println("");
		}
	
	}
}
