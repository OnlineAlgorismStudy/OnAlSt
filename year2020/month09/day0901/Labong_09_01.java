package september;

import java.util.Scanner;

public class Labong_09_01 {
	
	 static void out() {		
		System.out.println("~!@#$^&*()_+|");		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			out();
		} // for
		
	} // main

}
