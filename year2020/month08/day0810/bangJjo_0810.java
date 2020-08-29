package question.month08.day0810;

import java.util.Scanner;

public class bangJjo_0810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
		평균은 반올림하여 소수첫째자리까지 출력한다.

		-입력 예
		95 100 88 65 76 89 58 93 77 99
		-출력 예
		sum : 446
		avg : 78.8
*/
		
		Scanner sc = new Scanner(System.in);
		
		int input[] = new int[10];
		
		int even = 0;
		int odd = 0;
		int cnt = 0;
		double avg = 0;
		
		for(int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if(i%2 == 1) {
				odd += input[i];
			}else {
				even += input[i];
				cnt++;
				avg = (double)even/cnt;
			} // end if
		} // end for
		System.out.println("sum : "+ odd);
		System.out.println("avg : "+ avg);
	} // main

} // class
