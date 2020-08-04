package question.day0730;

import java.util.Scanner;

public class bangJjo_0730 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 1;
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.print(cnt+" ");
				cnt += 2;
				if(cnt > 10) {
					cnt = 1;
				}
			} // end for
			System.out.println();
		}
		
	}

}
