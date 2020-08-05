package question.month08.day0806;


import java.util.Scanner;

public class bangJjo_0806 {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	int num[] = new int[10];

    	int min = 1000;
    	
    	for(int i = 0; i < num.length; i++) {
    		num[i] = sc.nextInt();
    	
    		if(num[i] < min) {
    			min = num[i];
    		} // end if
    		
    	} // end for
    	System.out.println(min);
    } // main
    
} // class