package question.month10.day1002;

import java.util.Scanner;

public class bangJjo_1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		result(num);
		
	} // main

	public static void result(int num) {
		
		if(num == 0) {
			return;
		}else {
			System.out.print(num+ " ");
			num--;
			result(num);
		} // end if
		
		
	} // result
	
} // class
