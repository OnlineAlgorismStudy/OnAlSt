package question.month08.day0819;

import java.util.Scanner;

public class bangJjo_0819 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int[] num = new int[26];
		String str;
		char c;

		for (int i = 0; i < 100; i++) {
			str = sc.next();
			c = str.charAt(0);

			if ((c < 65) || c > 90) {
				break; // 대문자 이외의 문자가 입력되면 입력을 중단
			} else {
				num[c - 65]++;
			} // end if

		} // end for
		
		sc.close();
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) { 
				System.out.println((char)(65 + i) + " : " + num[i]);
			} // end if
		} // end for

	} // main

} // class
