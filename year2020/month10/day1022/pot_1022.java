package study;

import java.util.Scanner;

public class st_1022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 입력받을 문자열
		int len = sc.nextInt();// 뒤에서부터 출력하고 싶은 문자의 수
		if (str.length() > 100) {
			System.out.println("문자열의 길이는 100이하라구");
		} else {
			if (str.length() < len) { // 입력한 길이가 문자열보다 크면 그냥 str 출력
				System.out.println(str);
			} else { // 이외 경우의 수
				for(int i = str.length()-1;i>=len-1;i--) {
					System.out.print(str.charAt(i));
					
				}
			}

		}
	}
}
