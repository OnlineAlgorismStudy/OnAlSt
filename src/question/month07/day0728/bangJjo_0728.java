package question.day0728;

import java.util.Scanner;

public class bangJjo_0728 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 1;
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j < i; j++ ) {
				System.out.print("  ");
			}
			for(int j = num; j >= i; j--) {
				System.out.print(cnt+" ");
				cnt++;
			}
			System.out.println();
		}
		
	}

}
