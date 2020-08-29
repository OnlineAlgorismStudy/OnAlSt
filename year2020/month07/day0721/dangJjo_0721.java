package question.day0721;

import java.util.Scanner;

public class dangJjo_0721 {

    public static void main(String[] args) {
    	 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int cnt = 1;
        char a = 'A';
         
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num-i; j++) {
                System.out.print(cnt+" ");
                cnt++;
            } // end for
            for(int j = 0; j <= i; j++) {
            	System.out.print(a+" ");
            	a++;
            }
            System.out.println();
        } // end for
         
    } // main
	
}
