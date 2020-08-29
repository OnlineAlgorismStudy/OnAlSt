package august;

import java.util.Scanner;

public class Labong_08_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] num0 = new int[2][4];
		int[][] num1 = new int[2][4];
		

		while(true) {
			for(int i=0; i<2; i++) {
				if(i==0) { System.out.println("first array"); }
				for(int k=0;k<4;k++) {
					num0[i][k] = sc.nextInt();
				}
			}// for
			
			for(int i2=0; i2<2; i2++) {
				if(i2==0) { System.out.println("seound array"); }
				for(int k2=0;k2<4;k2++) {
					num1[i2][k2] = sc.nextInt();
				}
			}// for
			break;
		}
		for(int n=0; n<2;n++) {
			for(int n2=0; n2<4; n2++) {
				System.out.print((num0[n][n2] *num1[n][n2])+" " );
			}
			System.out.println();
		}//for
		
	}// main

}
