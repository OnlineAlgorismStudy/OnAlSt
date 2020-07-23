package question.day0724;

import java.util.Scanner;

public class dangJjo_0724 {

    public static void main(String[] args) {
    	 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for(int i = 1; i <= num; i++) {
            for(int j = i; j < (num*2)-i;j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        } // end for
        
    } // main
	
}
