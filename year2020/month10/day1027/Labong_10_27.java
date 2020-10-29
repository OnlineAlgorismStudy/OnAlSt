package october;

import java.util.Scanner;

public class Labong_10_27 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		input = input.replaceAll("[0-9]","").replaceAll("[!-/]","");
		input = input.toUpperCase();
		
		System.out.println(input);
	}

}
