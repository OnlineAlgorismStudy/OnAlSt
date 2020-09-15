package september;

import java.util.Scanner;

public class Labong_09_16 {
	static int count2 = 0;
	static int[] count = new int[3];
	
	static void result(int[][] num) {
		for(int k=0;k<num.length;k++) {
			
			for(int k2=0;k2<num.length; k2++) {
				System.out.print(num[k][k2]+" ");
			} // for		
			System.out.println(num[k][0]+num[k][1]+num[k][2]);
			
			for(int a=0; a<num.length; a++) {
				count[k]+=num[a][k];
			}// for
				count2+=count[k];
			
			if(k == 2) {
				for(int a2=0; a2<num.length;a2++) {
					System.out.print(count[a2]+" ");
				}
				System.out.println(count2);
			} // if
		}// for
	}
	

	public static void main(String[] args) {
		
		int[][] student = new int[3][3];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<student.length;i++) {
			for(int i2=0;i2<student.length; i2++) {
				student[i][i2] = sc.nextInt();	
			}//for	
		}// for
		result(student);
	} // main
}

