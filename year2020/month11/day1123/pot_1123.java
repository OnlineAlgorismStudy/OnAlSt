package study11;

import java.awt.Container;
import java.util.Scanner;

public class st_1123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		String[] arr = new String[5];
		// 입력받기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		// 찾으려고하는 문자
		String char1 = sc.next();
		String char2 = sc.next();

		System.out.print("문자가 들어간 단어를 찾아볼까?");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains(char1) || arr[i].contains(char2)) {
				str += arr[i] + '\n';
			}
		}
		
		if("".equals(str)) {
			System.out.println("none");
		}else {
			System.out.println(str);
		}
	}

}
