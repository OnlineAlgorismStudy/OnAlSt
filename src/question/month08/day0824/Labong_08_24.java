package august;

import java.util.Scanner;

public class Labong_08_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] person = new int[5][4];
		int result = 0;
		int count = 0;
		
		for(int i=0; i<person.length; i++) {
			System.out.println("학생" + (i+1));
			for(int i2=0; i2<person[i].length; i2++) {
				person[i][i2] = sc.nextInt();
			}
		}//for
		
		for(int k=0; k<person.length; k++) {
			for(int person2 : person[k]) {
				result += person2; 
			}
			if(result >= 80) {
				System.out.println("pass");
				result = 0;
				count++;
			}else {
				System.out.println("fail");
				result = 0;
			}
		}// for
		System.out.println("Successful : " + count);
	}// main

}
