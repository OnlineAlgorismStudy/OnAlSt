package august;

import java.util.Scanner;

public class Labong_08_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		int min = 0;
		int max = 0;	
		
		for(int i=0; i<num.length;i++) {
			num[i] = sc.nextInt();	
			if(num[i]==999) {
				break;
			}
		}
						
		for(int k=0; k<num.length;k++) {
			if(max < num[k]&& num[k] != 999) {
				max = num[k];
			}
			if(min > num[k] && num[k] != 0) {
				min = num[k];
			}
		}
		
		System.out.println("min : "+min +"\nmax : "+ max);
		
		

	}

}
