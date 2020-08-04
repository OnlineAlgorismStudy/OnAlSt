package homework;

import java.util.Scanner;

public class badak_0703 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a[] = sc.nextLine().split(" ");
		
		int b = Integer.parseInt(a[0])+5;
		int c = Integer.parseInt(a[1])*2;
		
		System.out.println("width = "+b);
		System.out.println("length = "+c);
		System.out.println("area = "+b*c);
	
	}

}

