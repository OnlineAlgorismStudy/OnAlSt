package october;

import java.util.Scanner;

public class Labong_10_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		result(num);
	}

	static void result(int num) {
		
		if(num != 0) {
			result(num/2);
			System.out.print(num+" ");
		}
	}
}
