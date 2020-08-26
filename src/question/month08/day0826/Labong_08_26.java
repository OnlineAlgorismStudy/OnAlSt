package august;

import java.util.Scanner;

public class Labong_08_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] ban = new int[4][1];
		int count =0;
		
		for(int i=0; i<4; i++) {
			System.out.println(i+1 + "class? ");
			for(int i2=0; i2<3; i2++) {				
				count += sc.nextInt();
			}
			ban[i][0] = count;
			count = 0;
		} // for

		sc.close();
		
		for(int k=0; k<ban.length; k++) {
			System.out.println(k+1 + "class : "+ ban[k][0]);
		}// for
		
	} // main

}
