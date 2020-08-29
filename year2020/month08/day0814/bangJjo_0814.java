package question.month08.day0814;

import java.util.Scanner;

public class bangJjo_0814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[100];
		int num = 0;
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
			
			if(arr[i] == 0) {
				break;
			} // end if
			
			if(arr[i]%5 == 0) {
				cnt++;
				sum += arr[i];
			} // end if
			
		} // end for
		sc.close();
		avg = (double)sum / cnt;
		
		System.out.println("Multiples of 5 : " + cnt);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
	} // main

} // class
