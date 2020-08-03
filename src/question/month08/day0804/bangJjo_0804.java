package question.month08.day0804;

import java.util.Scanner;


public class bangJjo_0804 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int[] num = new int[100];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] == 0) {
				break;
			} // end if
			
		} // end for
		
		sc.close();
		
		for(int i = num.length-1; i >= 0; i--) {
			if(num[i]!=0) {
				System.out.print(num[i] + " ");
			} // end if
		} // end for
		
	} // main

} // class
