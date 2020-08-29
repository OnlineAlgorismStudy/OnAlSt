package question.day0723;

import java.util.Scanner;

public class dangJjo_0723 {

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

        for(int i = 1; i <= num - 1; i++) {
        	for(int j = num - 1; j > i; j--) {
        		System.out.print(" ");
        	} // end for
        	for(int j = 0; j < (i * 2)+1 ; j++) {
        		System.out.print("*");
        	} // end for
        	System.out.println();
        } // end for
        
    } // main
	
}
