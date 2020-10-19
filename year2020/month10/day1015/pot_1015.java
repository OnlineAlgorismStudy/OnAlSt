package study;

import java.util.Scanner;

public class st_1019 {
	static double total = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int result = num1 * num2 * num3;
		System.out.println(recur(result));;
	}
	
	public static int recur(int result) {
		if(result==0) {
			return 1; //0이면 종료
		}
		int i = result % 10; 
		if(i==0) { //0이면 1로 바꿔주기
			i = 1;
		}
		result = result /10;
		return(i * recur(result));
	}
	

}
