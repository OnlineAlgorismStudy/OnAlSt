package homework;

import java.util.Scanner;

public class badak_0814 {

	/*
	0814

	100 개 이하의 정수를 입력받다가 0 이 입력되면 그 때까지 입력된 정수 중 5의 배수의 개수와 합계 평균을 출력하는 프로그램을 작성하시오.
	평균은 소수점 이하 1자리까지 출력한다.
	
	
	-입력 예
	35 10 23 100 64 51 5 0
	-출력 예
	Multiples of 5 : 4
	sum : 150
	avg : 37.5
	 */
	static int MAX_SIZE = 100 ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArray = new int[MAX_SIZE];
		int cnt = 0;
		int sum = 0;
		for(int i=0;i<MAX_SIZE;i++) {
			numArray[i] = sc.nextInt();
			if(numArray[i]==0) {
				break;
			}
			if(numArray[i]%5==0) {
				cnt++;
				sum += numArray[i];
			}
		}
		sc.close();
		System.out.println("Multiples of 5 : "+cnt);
		System.out.println("sum : "+sum);
		System.out.println("avg : "+Math.round(((double)sum/cnt)*10)/10.0);
	}
}
