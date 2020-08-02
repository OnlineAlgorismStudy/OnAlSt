package question.day0729;

import java.util.Scanner;

public class bangJjo_0729 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		} // end for
		
		for(int i = 1; i < num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= num - i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		} // end for

	}

}
