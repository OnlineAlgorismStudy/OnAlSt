package question.month09.day0904;

import java.util.Scanner;

public class bangJjo_0904 {

	public static int max(int num1, int num2, int num3) {
		
		int tempMax = num1;
		
		if(tempMax < num2) {
			tempMax = num2;
		} // end if
		
		if(tempMax < num3) {
			tempMax = num3;
		} // end if
		
		return tempMax;
		
	} // quadrangle

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		System.out.println(max(num1, num2, num3));
		
		sc.close();
	} // main

} // class
