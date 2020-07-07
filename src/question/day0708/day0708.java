package question.day0708;

import java.util.Scanner;

public class day0708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			
			System.out.print("number? ");
			
			input = sc.nextInt();
			
			if(input == 1) {
				System.out.println("\nSeoul\n");
			} else if(input == 2) {
				System.out.println("\nWashington\n");
			} else if(input == 3) {
				System.out.println("\nTokyo\n");
			} else if(input == 4) {
				System.out.println("\nBeijing\n");
			} else {
				System.out.println("\nnone\n");
				break;
			} // end if
		} // end while
		sc.close();
		
	} // end main

} // end class
