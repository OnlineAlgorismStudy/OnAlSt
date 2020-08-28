package question.month08.day0831;

import java.util.Scanner;

public class bangJjo_0831 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] arr = new char[3][5];
		char input = 0;
		int output = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				input = sc.next().charAt(0);
				arr[i][j] = input;
			} // end for
		} // end for
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				output = arr[i][j] + 32;
				System.out.print((char)output+" ");
			} // end for
			System.out.println();
		} // end for
		
	} // main

} // class
 