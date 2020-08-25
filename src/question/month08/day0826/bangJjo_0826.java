package question.month08.day0826;

import java.util.Scanner;

public class bangJjo_0826 {
 
    public static void main(String[] args) {
 
        int [][] arr = new int [4][3];
        int [] score = new int [4];
        int num=0;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++) {
            System.out.print(i+1+"class? ");
            for(int j=0;j<arr[i].length;j++) {
                num = sc.nextInt();
                arr[i][j] = num;
            } // end for
        } // end for
        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                score[i] += arr[i][j];
            } // end for
            System.out.println(i+1+"class : "+score[i]);
        } // end for
        sc.close();
    } // main
} // class

