package october;

import java.util.Scanner;

public class Labong_10_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuffer strb = new StringBuffer();
		
		String str = sc.next();
		int num = sc.nextInt();
		
		strb.append(str);

		System.out.println(strb.reverse().substring(0, 3));


	}

}
