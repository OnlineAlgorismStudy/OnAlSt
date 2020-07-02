package question.day0702;

import java.util.Scanner;

public class bangJjo_0702 {

	public static void main(String[] args) {
		
		
		double input = 0;
		double yard = 91.44;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("yard? ");
		input = sc.nextDouble();
		
		System.out.printf("%.1fyard = %.1fcm",input,input*yard);
		
	}
}
