package november;

import java.util.Scanner;

public class Labong_11_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str =sc.nextLine();
		int count = str.indexOf(" ");
		
		String[] arr = str.split(" ");
		
		for(int i=0; i<str.length(); i++) {
			System.out.println((i+1)+"."+arr[i]);
		}
		

	}

}
