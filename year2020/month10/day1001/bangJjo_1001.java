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
		
		if(num == 0) {
			return;
		}else {
			System.out.println("recursive");
			num--;
			recursive(num);
		} // end if
		
	} // recursive

} // class
