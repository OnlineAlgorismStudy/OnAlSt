package question.day0703;

import java.util.Scanner;

public class bangJjo_0703 {

	public static void main(String[] args) {
		
		
		int width = 0;
		int length = 0;
		
		Scanner sc = new Scanner(System.in);
		
		width = sc.nextInt();
		length = sc.nextInt();
		
		sc.close();
		
		width+=5;
		length*=2;
		
		System.out.println("width = "+width);
		System.out.println("length = "+length);
		System.out.println("area = "+(width*length));
		
	}
}
