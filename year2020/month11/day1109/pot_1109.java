package study11;

import java.util.Scanner;

public class st_1110 {

	public static void main(String[] args) {
		String result = "fighting";
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		while(str.length() > 20) {
			System.out.print("다시 입력 !");
			str = sc.nextLine();
			
		}
		System.out.println(str + result); //코리아 파이팅!!
	}

}

