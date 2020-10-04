package question.month10.day1007;

import java.util.Scanner;

public class bangJjo_1007 {

	static Scanner sc = new Scanner(System.in);
	static int sum = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = sc.nextInt();
		
		System.out.println(result(num));
		
		sc.close();
	} // main
		
	public static int result(int num) {

		if(Integer.toString(num).length() == 1) {
			sum += num * num;
			return sum;
		} else {
			int temp = num % 10;
			sum += temp * temp;
			return result(num / 10);
		} // end if
		
	} // result
	

} // class
