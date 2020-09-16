package september;

import java.util.Scanner;

public class Labong_09_18 {
	
	static int silsu(int s1,int s2) {
		
		if(Math.abs(s1) < Math.abs(s2)) {
			return s2;
		}else {
			return s1;
		}
	}

	static void jungsu(double j1, double j2) {
		
		if(Math.abs(j1) < Math.abs(j2)) {
			System.out.printf("%.2f",j1);
		}else {
			System.out.printf("%.2f",j2);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		double j1 = sc.nextDouble();
		double j2 = sc.nextDouble();
		
		System.out.println(silsu(s1,s2));
		
		jungsu(j1,j2);
	}

}
