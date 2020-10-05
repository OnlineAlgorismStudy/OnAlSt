package september;

import java.util.Scanner;

public class Labong_09_30 {

	final static double oneju = 3.141592; 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("radius : ");
		double radius = sc.nextDouble();
		result(radius);
	}
	
	static void result(double doubles) {
		
		Double area = doubles * doubles * oneju;
		System.out.println(area);
		System.out.printf("area = %.3f",area);
	}
}
