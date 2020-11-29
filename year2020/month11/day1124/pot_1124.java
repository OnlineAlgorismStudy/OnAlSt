package study11;

import java.util.Scanner;

public class st_1124 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int length = sc.nextInt();
		
		System.out.println(str1+str2);
		System.out.println(str1.substring(0,3)+str2.substring(3,str2.length()));
		
		
	}

}
