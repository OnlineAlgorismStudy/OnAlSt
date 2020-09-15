package question.month09.day0923;

import java.util.Scanner;

public class bangJjo_0923 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print();
		
	} // main
	
	public static void print() {
		
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		int cnt = 0;
		
		sc.close();
		
		num1 = Math.sqrt(num1);
		num2 = Math.sqrt(num2);
		
		double max = 0;
		double min = 0;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else if(num1 < num2) {
			max = num2;
			min = num1;
		} // end if
		
		min = (int)Math.ceil(min);
		max = (int)Math.floor(max);
		
		for(int i = (int) min; i <= max; i++) {
			cnt++;
		} // end for
		System.out.println(cnt);
	} // print
	
} // class
