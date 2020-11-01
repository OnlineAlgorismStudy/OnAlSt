package study10;

import java.util.Scanner;

public class st_1030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()); //a~z,A~Z,0~9 빼고 나머지 문자 다 제외해
	}

}
