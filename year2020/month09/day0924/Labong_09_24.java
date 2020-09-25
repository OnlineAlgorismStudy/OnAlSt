package september;

import java.util.Scanner;

public class Labong_09_24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		for(int i =0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		calculation(num);
	
	}

	static void calculation(int[] num) {
		
		int sum = 0;
		
		for(int k=0; k<num.length; k++) {
			sum += Math.abs(num[k]);
		}
		System.out.println(sum);
	}
	
}
