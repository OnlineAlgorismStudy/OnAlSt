package november;

import java.util.Scanner;

public class Labong_11_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str1 = "";
		String str2 = "";
		while(true) {
			System.out.println("??");
			str1 = sc.next();
			str2 = sc.next();
			if(str1.length() > 100 || str1.length() > 100) {
				str1 = ""; str2 = "";
				continue;
			}else {
				break;
			}
		}
		
		if(str1.length() < str2.length()) {
			System.out.println(str2.length());
		}else {
			System.out.println(str1.length());
		}

	}

}
