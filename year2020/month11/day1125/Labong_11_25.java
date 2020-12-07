package november;

import java.util.Scanner;

public class Labong_11_25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		String str1="";
		String str2="";
		int i=0;
		int i2=0;
		
		str1 = sc.next(); str2 = sc.next();
			
		str1 = str1.replaceAll("[^0-9]","|/|");
		str2 = str2.replaceAll("[^0-9]","|/|");
		
		i = Integer.parseInt( str1.substring(0, str1.indexOf("|/|")) );
		i2 = Integer.parseInt( str2.substring(0, str2.indexOf("|/|")) );
		System.out.println(i*i2);
		

	}

}
