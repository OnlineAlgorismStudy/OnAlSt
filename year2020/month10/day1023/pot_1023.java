package study;

import java.util.Scanner;

public class st_1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 문자열 : ");
		String str1 = sc.next();
		System.out.print("두번째 문자열 : ");
		String str2 = sc.next();
		if(str1.length() > 20 || str2.length() > 20) {
			System.out.println("20자 미만으로 입력해 !");
		}else {
			int result = str1.length() + str2.length();
			System.out.println(result);
		}
		
	}

}
