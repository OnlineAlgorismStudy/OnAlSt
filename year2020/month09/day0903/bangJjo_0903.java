package question.month09.day0903;

import java.util.Scanner;

public class bangJjo_0903 {
	
	public static void quadrangle(int num) {
		
		int cnt = 0;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				cnt++;
				System.out.print(cnt+" ");
			} // end for
			System.out.println();
		} // end for
		
		
	} //  quadrangle
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		sc.close();
		
		quadrangle(num);
	} // main

} // class
