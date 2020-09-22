package question.month10.day1001;

import java.util.Scanner;

public class bangJjo_1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		recursive(num);
		
	} // main
	
	public static void recursive(int num) {
		
		for(int i = 0; i < num; i++) {
			System.out.println("recursive");
		} // end for
		
	} // recursive

} // class
