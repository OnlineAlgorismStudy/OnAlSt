package homework;

import java.util.Scanner;

public class badak_0717 {

	/*
	0717

	자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.

	- 입력 예
	3
	- 출력 예
	***** i 0 j 0 k 0~4   3*2  -1 (i*2)+1 
	 ***  i 1 j 0~1 k 0~2 3*2  -3         
	  *   i 2 j 0~2 k 0~1 3*2  -5
	  
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			} 
			for(int k = 0; k < (a*2)-((i*2)+1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
