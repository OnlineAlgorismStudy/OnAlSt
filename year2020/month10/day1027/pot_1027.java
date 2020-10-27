package study;

import java.util.Scanner;

public class st_1027 {

	public static void main(String[] args) {
		//정규식,, 좀더 찾아볼것!
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		
	}

}
