package study11;

import java.util.Scanner;

public class st_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(str1.substring(0,2) + str2.substring(2,str2.length()) + str1.substring(0,2));
	}

}
