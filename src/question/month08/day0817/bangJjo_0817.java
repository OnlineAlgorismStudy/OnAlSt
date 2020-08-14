package question.month08.day0817;

import java.util.Scanner;

public class bangJjo_0817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[100];
		int num = 0;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
			
			if(arr[i] == 0) {
				break;
			} // end if
			cnt++;
		} // end for
		
		sc.close();
		
		System.out.println(cnt);
		
		for(int i = 0; i < cnt; i++) {
			if(arr[i] % 2 == 1) {
				System.out.print(arr[i] * 2 + " ");
			}else {
				System.out.print(arr[i] / 2 + " ");
			} // end if
		} // end for
	} // main

} // class
