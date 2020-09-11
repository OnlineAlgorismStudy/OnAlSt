package september;

import java.util.Scanner;

public class Labong_09_11 {
	static int number = 0;
	static int result(int num) {
		
		for(int i=1; i<=1000; i++) {
			number += i;
			if(i==num ) {break;} 		
		}
		return number;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(result(sc.nextInt()));
	}

}
