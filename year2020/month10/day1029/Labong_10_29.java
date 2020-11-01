package october;

import java.util.Scanner;

public class Labong_10_29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = str.length()-1;
		
		for(int i=0; i<str.length(); i++) {
			
			for(int i2= (str.length()-1)-i; i2<str.length(); i2++) {
				System.out.print(arr[i2]);
			}
			
			for(int i3=0; i3<count; i3++) {
				System.out.print(arr[i3]);
			}
			count--;
			System.out.println();
		}
	
	}

}
