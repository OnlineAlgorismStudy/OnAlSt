package august;

import java.util.Scanner;

public class Labong_08_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		int[] num = new int[10];									
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}

		for(int k=0; k<num.length;k++) {
			if((k+1) % 2 == 0) {
				sum += num[k];
			}else {
				avg += num[k];
				count++;
			}
		}
		System.out.println("sum : " + sum+"\n"+ "avg : " + (avg / count));
	}

}
