package august;

import java.util.Scanner;

public class Labong_08_28 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int[][] num = new int[4][2];
		int result = 0;
		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			for(int i2=0; i2<2; i2++) {
				num[i][i2] = sc.nextInt();
				sum += num[i][i2];
			}
		} // for
		
		for(int[] ga : num) {			
			System.out.print((ga[0]+ga[1])/2 + " ");			
		} // for
		
		System.out.println();
		
		for(int a=0; a<2; a++) {
			for(int a2=0; a2<num.length; a2++) {
				result += num[a2][a];
			}
			System.out.print(result/4 + " ");
			result = 0;
		} // for
		System.out.println();
		System.out.println("" + sum/8);
	}// main
			
}
