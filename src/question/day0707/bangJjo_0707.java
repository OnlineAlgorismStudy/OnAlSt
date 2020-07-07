package question.day0707;

import java.util.Scanner;

public class bangJjo_0707 {

	public static void main(String[] args) {
		
	
		int input = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number? ");
		
		input = sc.nextInt();
		
		sc.close();
		
		if(input == 1) {
			System.out.println("dog");
		}else if(input == 2){
			System.out.println("cat");
		}else if(input == 3){
			System.out.println("chick");
		}else {
			System.out.println("I don't know");
		}
		
	}
}
