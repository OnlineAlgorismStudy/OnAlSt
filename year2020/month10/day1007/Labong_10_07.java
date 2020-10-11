package october;

import java.util.Scanner;

public class Labong_10_07 {
	
	static int sum = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		for(int i=0; i<1;) {
			int num = sc.nextInt();
			if(num < 1 || num >1000000000) {
				System.out.println("9이하의 자연수를 입력해주십시오.");
				continue;
			}else {
				System.out.println(result(num));
			}
		}
		
	}

	static int result(int num) {
		
		int a = 0;
		if(num == 1) {
			sum += num * num;
			return sum;
			
		}else {
			a += num % 10;
			sum += a * a;
			return result(num / 10);
		}
	}
}
