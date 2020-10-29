package question.month10.day1030;

import java.util.Scanner;

public class bangJjo_1030 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        Scanner sc = new Scanner(System.in);
 
        String input = sc.nextLine();
 
        String[] arr = input.split("");
 
        for (int i = 0; i < arr.length; i++) {
 
            char temp = input.charAt(i);
 
            if (temp >= 65 && temp <= 90) {
 
                System.out.print((char) (temp + 32));
 
            } else if (temp >= 97 && temp <= 122) {
 
                System.out.print(temp);
            } else if (temp >= 48 && temp <= 57) {
 
                System.out.print(temp);
            } // end if
 
        } // end for
        sc.close();
    } // main
 
} // class