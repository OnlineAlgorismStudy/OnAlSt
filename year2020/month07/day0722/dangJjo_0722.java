package question.day0722;

import java.util.Scanner;

public class dangJjo_0722 {

    public static void main(String[] args) {
    	 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for(int i = 1; i < num; i++) {
        	for(int j = 0; j < i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        } // end for
        
        for(int i = 0; i < num; i++) {
        	for(int j = 0; j < num - i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        } // end for

    } // main
	
}
