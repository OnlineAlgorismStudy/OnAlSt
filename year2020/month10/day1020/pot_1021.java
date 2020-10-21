package study;

import java.util.Scanner;

public class st_1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.length()>100) {
			System.out.println("너무 크다구!");
		}else {
			for(int i = 0; i < 2; i++) {
				System.out.print(str);
			}
		}
	}

}
