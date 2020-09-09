package september;

import java.util.Arrays;
import java.util.Scanner;

public class Labong_09_08 {
	
	static void result1(int[] num) {
		for(int k=0; k<num.length; k++) {
			if(k ==0) {
				System.out.println(num[k] * 2);
			}else {
				System.out.println(num[k] / 2);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[2];
		for(int i=0; i<2;i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		result1(num);
	}

}
