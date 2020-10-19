package study;

import java.util.Scanner;

public class st_1019_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("아스키코드?? : ");
			int num = sc.nextInt();
			if(!(num>=33 && num<=127)) {
				break;
			}else {
				System.out.println((char)num);
			}
		}
	}
}
