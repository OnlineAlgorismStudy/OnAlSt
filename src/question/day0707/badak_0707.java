package homework;

import java.util.Scanner;

public class badak_0707 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number? ");
		String a = sc.next();
		
		switch(a) {
		case "1":
			System.out.println("dog");
			break;
		case "2":
			System.out.println("cat");
			break;
		case "3":
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know.");
			break;
		}
	}
}

