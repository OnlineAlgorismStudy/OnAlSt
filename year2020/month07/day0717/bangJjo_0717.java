package question.day0717;

import java.util.Scanner;

public class bangJjo_0717 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            } // end for
            for(int j = 0; j < ((num-i)*2-1); j++) {
                System.out.print("*");
            } // end for
            System.out.println();
        } // end for

	} // end main

} // end class
