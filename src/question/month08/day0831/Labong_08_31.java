package august;

import java.util.Scanner;

public class Labong_08_31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[][] num = new char[3][5];
		
		for(int i=0; i< num.length; i++) {
			for(int i2=0; i2<num[0].length; i2++) {
				num[i][i2] =  sc.next().charAt(0);
			}
		} // for
		
		for(int k=0; k< num.length; k++) {
			for(int k2=0; k2<num[0].length; k2++) {
				System.out.print((char)(num[k][k2]+32) + " ");
			}
			System.out.println();
		} // for
		
	} // mian

}
