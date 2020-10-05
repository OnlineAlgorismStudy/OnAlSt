package october;

import java.util.Scanner;

public class Labong_10_05 {

	static int count = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		num = sc.nextInt();
		
		result(num);
	}
	
	static void result(int num) {
			
		if(num == 0) {
			System.out.println(count);
			return;
		}else {
			count += num;
			result(num-1);
		}
	}
}
