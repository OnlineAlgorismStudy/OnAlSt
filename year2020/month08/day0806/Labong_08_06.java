package august;

import java.util.Scanner;

public class Labong_08_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int result = 1000;
		
		for(int i=0; i < num.length;) {		
			num[i] = sc.nextInt();
			if(num[i] >= 1000) {
				continue;
			}
			i++;
		}
	
		for(int k=0; k < num.length; k++) {
			if(result > num[k]) {
				result = num[k];
			}
		}
		System.out.println(result);
	}

}
