package question.day0710;

import java.util.Scanner;

public class bangJjo_0710 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 0;
		int score = 0;
		int sum = 0;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		cnt = sc.nextInt();
		
		if(cnt <= 10) {
					
			for(int i = 0; i < cnt; i++) {
				score = sc.nextInt();
				sum += score;
			}
			
			avg = (double)sum/cnt;
			
			System.out.printf("avg : %.1f\n",avg);
			
			if(avg >= 80) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
		
		}
		
		sc.close();
	}

}
