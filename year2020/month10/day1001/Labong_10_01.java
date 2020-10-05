package october;

import java.util.Scanner;

public class Labong_10_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("20이하의 자연수를 입력하시오.");
			int cnt = sc.nextInt();
			
			if(cnt >0 || cnt <=20) {
				result(cnt);
				break;
			}
		}

	}
	
	static void result(int num) {
	
		if(num == 0) {
			return;
		}else {
			System.out.println("recursive");
			result(num-1);
		}
	}

}
