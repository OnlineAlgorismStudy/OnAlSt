package homework;

import java.util.Scanner;

public class badak_0817 {

	/*
	 * 0817

정수를 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력 받은 개수를 출력한 후

입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을, 

짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램을 작성하시오.

 

입력되는 정수의 개수는 100개 이하이다. 


-입력 예
8 10 5 15 100 0
-출력 예
5
4 5 10 30 50
	 */
	static final int MAX_SIZE = 100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numArray = new int [MAX_SIZE]; 
		int cnt = 0;
		
		for(int i=0;i<MAX_SIZE;i++) {
			numArray[i] = sc.nextInt();
			if(numArray[i]==0) {
				break;
			}
			cnt++;
		}
		sc.close();
		System.out.println(cnt);
		for(int i=0;i<cnt;i++) {
			if(numArray[i]%2==0)
				System.out.print(numArray[i]/2+" ");
			else
				System.out.print(numArray[i]*2+" ");
		}
	}
}
