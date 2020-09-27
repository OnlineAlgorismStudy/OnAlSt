package september;

import java.util.Scanner;

public class Labong_09_28 {
	
	static void one(double[] oneBle) {	
		double sum = 0;
		
		for(int k=0; k<oneBle.length; k++) {
			sum += oneBle[k];		
		} // for AND
		System.out.println(Math.round(sum / 3));
	}

	static void two(double[] twoBle) {
		double sum = 0;
		
		for(int k2=0; k2<twoBle.length; k2++) {
			sum += Math.round(twoBle[k2]);
		}
		System.out.println(Math.round(sum / 3));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] ble = new double[3];
		
		for(int i=0; i<ble.length; i++) {
			ble[i] = sc.nextDouble();
		}
		
		one(ble);
		two(ble);		
	}

}
