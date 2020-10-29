package study;

import java.util.Scanner;

public class st_1028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("입력 : ");
		String str = sc.nextLine(); // 문자열을 입력받아

		for (int i = 0; i < str.trim().length(); i++) { // 일단 문자열을 합쳐야겠지
			if (str.charAt(i) == ' ') {//문자하나하나 검색해서 공백이면
				count++; //카운트증가
			}
		}
		System.out.println(count);
	}

}
