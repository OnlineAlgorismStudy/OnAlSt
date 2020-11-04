package november;

import java.util.Scanner;

public class Labong_11_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer str = new StringBuffer(sc.next());
		
		while(str.length() > 1) {
			int count = sc.nextInt();
			
			if(str.length() == 1) {break;}
			if(str.length() < count) { str.deleteCharAt(str.length()-1); }
			else { str.deleteCharAt(count); }
			System.out.println(str);
		}

	}

}
