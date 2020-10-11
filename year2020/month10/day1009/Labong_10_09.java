package october;

import java.util.Scanner;

public class Labong_10_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		result(num);
	}

	static void result(int num) {
		if(num % 2 == 0) {
			if(num == 2) {
				System.out.println(num+" ");
			}else {
				result(num-2);
				System.out.println(num+" ");
			}
		}else if(num % 2 == 1){
			if(num == 1) {
				System.out.println(num+" ");
			}else {
				result(num-2);
				System.out.println(num+" ");
			}
		}
	}
}
