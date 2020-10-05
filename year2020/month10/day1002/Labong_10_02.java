package october;

import java.util.Scanner;

public class Labong_10_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while(num <= 50 || num >0) {
			result(num = sc.nextInt());
		}

	}
	
	static void result(int num) {
		
		if(num == 0) {
			return;
		}else {
			System.out.print(num+" ");
			result(num-1);
		}
	}

}
