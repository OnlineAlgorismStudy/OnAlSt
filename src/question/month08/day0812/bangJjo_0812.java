package question.month08.day0812;

import java.util.Scanner;

public class bangJjo_0812 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		int num = 0;
		int odd = 0;
		int even = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
		} // end for
		
		for(int i = 0; i < arr.length; i++) {
			
			if((i+1)%2==0) {
				even += arr[i];
			}else {
				odd += arr[i];
			} // end if
			
		} // end for
		System.out.println("odd : "+odd);
		System.out.println("even : "+even);
		sc.close();
	} // main

} // class
