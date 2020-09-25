package september;

import java.util.Scanner;

public class Labong_09_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		
		sc.close();
		
		root(Math.sqrt(a), Math.sqrt(b));
		
	}
	
	private static void root(double a, double b) {
		
		int max = 0;
		int min = 0;
		int cnt = 0;
		
		max =(int) Math.max(a, b);
		min = (int) Math.min(a, b);
	
		for(int i=min; i<max; i++) {
			cnt++;
		}
		System.out.println(cnt);
	}

}
