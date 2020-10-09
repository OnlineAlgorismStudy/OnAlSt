package october;

import java.util.Scanner;

public class Labong_10_06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("?"+result(num));
	}
	public static int result(int num) {
		if(num <= 1) {
			System.out.println("탈출");
			return 1;
		} // end if
		
		return result(num/2) + result(num-1);
	} // result
}
