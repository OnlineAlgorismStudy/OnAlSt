package study;

import java.util.Scanner;

public class st_1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		recur(num);
	}
	public static void recur(int num) {
		if(num < 1) {
			return;
		}else {
			recur(num/2);
			System.out.print(num + " ");
		}
	}
	
}
