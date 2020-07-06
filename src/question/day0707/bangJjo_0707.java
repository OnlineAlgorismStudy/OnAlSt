package question.day0707;

import java.util.Scanner;

public class bangJjo_0707 {

	public static void main(String[] args) {
		
		
		int year = 0;

		Scanner sc = new Scanner(System.in);
		
		year = sc.nextInt();
		
		sc.close();
		
		if((year%400==0) || (year%4==0 && year%100!=0)) {
			System.out.println("leap year");
		}else{
			System.out.println("common year");
		}
		
	}
}
