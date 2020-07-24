package question.day0727;

import java.util.Scanner;

public class dangJjo_0727 {

    public static void main(String[] args) {
    	 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for(int i = 1; i <= num; i++) {
            for(int j = i; j < (num * 2) - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        } // end for
        
    } // main
	
}
