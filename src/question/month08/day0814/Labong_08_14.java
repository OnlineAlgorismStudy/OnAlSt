package august;

import java.util.Scanner;

public class Labong_08_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int multples = 0;
		int sum = 0;
		double avg = 0;
		
		int[] num = new int[100];
		
		for(int i=0; i< num.length; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] == 0) {break;}
		}
		for(int k=0; k<num.length; k++) {
			if(num[k] % 5 == 0 && num[k] != 0) { 
				multples++;
				sum += num[k];
			}
		}
		avg = (double)sum/multples;
		System.out.println("Multples of 5 : " +multples);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
