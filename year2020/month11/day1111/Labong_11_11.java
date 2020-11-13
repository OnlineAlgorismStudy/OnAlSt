package november;

import java.util.Scanner;

public class Labong_11_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
			
		while(str.length() > 100) {
			
			str = sc.next();
		}
		
		if(str.contains("c") || str.contains("ab")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}
