package question.day0731;

import java.util.Scanner;

public class bangJjo_0731 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		while(true) {
			
			if(s < 2 || s > 9 || e < 2 || e > 9) {
				System.out.println("INPUT ERROR!");
				s = sc.nextInt();
				e = sc.nextInt();
			} else {
				break;
			} // end if
		} // end while
		
		if(s > e) {
			for(int i = 1; i <= 9; i++) {
				for(int j = s; j >= e; j--) {
					System.out.printf("%d * %d = %2d   ", j,i,j*i);
				} // end for
				System.out.println();
			} // end for
		} else {
			for(int i = 1; i <= 9; i++) {
				for(int j = s; j <= e; j++) {
					System.out.printf("%d * %d = %2d   ", j,i,j*i);					
				}// end for
				System.out.println();
			} //end for
		}
		
		
	}
	
}
