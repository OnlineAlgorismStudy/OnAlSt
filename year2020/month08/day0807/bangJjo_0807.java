package question.month08.day0807;

import java.util.Scanner;

public class bangJjo_0807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int[] input = new int[10];
		int input_max = 10000;
		int input_min = 1;
		int change = 100;
		
		for(int i = 0; i < input.length; i++) {
			
			num = sc.nextInt();
			
			input[i] = num;
			
			if(input_max > input[i] && change <= input[i]) {
				input_max = input[i];
			} else if(input_min < input[i] && change > input[i]) {
				input_min = input[i];
			} // end if
			
		} // end for
		
		if(input_min==1) {
			input_min = change;
		}else if(input_max==10000) {
			input_max = change;
		} // end if
		
		sc.close();
		System.out.println(input_min+" "+input_max);
	} // main

} // class
