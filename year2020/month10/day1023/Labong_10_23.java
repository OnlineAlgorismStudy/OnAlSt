package october;

import java.util.Scanner;

public class Labong_10_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "";
		String str2 = "";
		
		while(true) {
			str1 = sc.next();
			str2 = sc.next();
			
			if((str1.length()+str2.length())<20){
				System.out.println(str1.length()+str2.length());
				break;
			}else {
				System.out.println("20자 미만으로 다시 입력해주십시오.");
				continue;
			}
		}

	}

}
