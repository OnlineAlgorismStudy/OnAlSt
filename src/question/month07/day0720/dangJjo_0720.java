package question.day0720;

import java.util.Scanner;

public class dangJjo_0720 {

    public static void main(String[] args) {
    	 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        char a = 'A';
         
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num-i; j++) {
                System.out.print(a);
                a++;
            } // end for
            System.out.println();
        } // end for
         
    } // main
	
}
