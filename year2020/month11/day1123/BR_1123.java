import java.util.Scanner;

public class BR_1123 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 5개의 단어(각 단어는 100자 이하)를 입력받은 후 문자와 문자열(100자 이하)을 한 개씩 입력받아 나중에 입력받은 문자나 문자열이 포함된 단어를 모두 출력하는 프로그램을 작성하시오.
		 * 찾는 단어가 없으면 "none"이라고 출력한다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * banana
		 * apple
		 * melon
		 * tomato
		 * pear
		 * n
		 * to
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * banana
		 * melon
		 * tomato
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {
			words[i] = sc.next();
			if (words[i].length() > 100) {
				i--;
			}
		}
		
		String c = sc.next().substring(0, 1);
		String w = sc.next();
		sc.close();
		
		String result = "";
		for (String word : words) {
			if (word.indexOf(c) > -1 || word.indexOf(w) > -1) result += word+"\n"; 
		}
		
		if ("".equals(result)) System.out.println("none");
		else System.out.println(result.trim());
	}
}
