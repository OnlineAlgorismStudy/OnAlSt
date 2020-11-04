package october;

import java.util.Scanner;

public class Labong_10_30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(true) {
			str = sc.nextLine();
			
			if(str.length() >100) {
				str = "";
			}else {
				str = str.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
				break;
			}
		}
		System.out.println(str);
	}

}
