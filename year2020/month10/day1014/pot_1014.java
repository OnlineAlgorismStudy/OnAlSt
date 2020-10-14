package study;

import java.util.Scanner;

public class st_1014 {
	static int level = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1  = sc.nextInt();
		if(num1>1000000) {
			System.out.println("다시입력하라구!");
		}else {
			recur(num1,level);
		}
	}
	public static void recur(int num1,int level) {
		if(num1 % 2 ==0) { //짝수
			if(num1 == 1) { //num1 이 1이면 level 출력 후 종료
				System.out.println(level);
				return;
			}
			level++; //나누는 횟수 증가
			recur((num1/2),level);//재귀호출
		}else { //홀수
			if(num1 == 1) {
				System.out.println(level);
				return;
			}
			level++;
			recur((num1/3),level);
		}
	}
}
