package october;

import java.util.Scanner;

public class Labong_10_26 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char scan = sc.next().charAt(0);
	
		System.out.print(scan >= 48 && scan <= 57 ? scan : "");
		
		System.out.print(scan >= 65 && scan <= 90 ? scan : "");
		
		System.out.print(scan >= 97 && scan <= 122 ? scan : "");
		
		if(!(scan >= 48 && scan <= 57) || 
		    (scan >= 65 && scan <= 90) ||
		    (scan >= 97 && scan <= 122)) 
			break;
			
	}
}
