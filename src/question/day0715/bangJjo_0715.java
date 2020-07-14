package question.day0715;

import java.util.Scanner;

public class bangJjo_0715 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		for(int i = 0; i < num; i++) {
			for(int j = i; j < num; j++) {
				System.out.print("*");
			} // end for
			System.out.println();
		} // end for
		
		for(int k = 0; k < num; k++) {
			for(int l = 0; l <= k; l++) {
				System.out.print("*");
			} // end for
			System.out.println();
		} // end for
		
	} // end main

} // end class
