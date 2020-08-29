package september;

import java.util.Scanner;

public class Labong_09_04 {

	static int reint(int[] num) {
		int result = 0;
		
		for(int k=0; k<3; k++) {			
			if(result< num[k2]) {
				result = num[k2];
			}			
		} // for 	
		return result;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		
		for(int i=0; i<3; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(reint(num));	
	} // main

}
