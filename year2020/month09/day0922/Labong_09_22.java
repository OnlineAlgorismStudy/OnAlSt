package september;

import java.util.Scanner;

public class Labong_09_22 {
	
	static void result(int num1,int num2) {
		int all = 0;
		int temp = 0;
		
		for(int i=0; i<=2; i++) {
			 if(temp == 0) {
				 temp = Math.abs(num1-num2);
			 }else {
				 all = temp * temp; 
			 }
		}
		
		System.out.println("("+num1+" - "+num2+")" + " ^2 = "+all);
		temp = 0;
		all = 0;
		
		for(int i2=0; i2<2; i2++) {
			 if(temp == 0) {
				 temp = Math.abs(num1+num2);
				 all = temp * temp; 
			 }else {
				 all = all * temp; 
			 }
		}
		System.out.println("("+num1+" + "+num2+")" + " ^3 = "+all);	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		result(sc.nextInt(),sc.nextInt());
	}

}
