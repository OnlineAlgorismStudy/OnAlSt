package november;

import java.util.Scanner;

public class Labong_11_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		int n = sc.nextInt();
		
		System.out.println(str1+str2);
		
		str1 = str1.substring(0,n);
		str2 = str2.substring(n, str2.length());
		
		System.out.println(str1+str2);
		
		sc.close();
	}

}
