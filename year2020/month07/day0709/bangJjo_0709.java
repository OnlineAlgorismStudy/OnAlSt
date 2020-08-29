package question.day0709;

import java.util.Scanner;

public class bangJjo_0709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 0;
		int height = 0;
		double area = 0;
		String answer = "";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Base = ");
			base = sc.nextInt();

			System.out.print("Height = ");
			height = sc.nextInt();
			
			area = (double)(base*height)/2;
			
			System.out.println("Triangle width = "+area);
			
			System.out.print("Continue? ");
			answer = sc.next();
			
			if(!answer.equalsIgnoreCase("y")) {
				break;
			}
			
		} // end while
	} // end main

} // end class
