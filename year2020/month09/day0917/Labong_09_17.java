package september;

import java.util.Arrays;
import java.util.Scanner;

public class Labong_09_17 {
	
	static void result(int[] param) {
		
		Arrays.sort(param);
		for(int k=param.length-1; k>=0; k--) {
			System.out.print(param[k]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] num = null;
		int use = 0;
		Scanner sc = new Scanner(System.in);
		
		use = sc.nextInt();
		if(!(use > 10)) {
			num = new int[use];
		}
		
		for(int i=0; i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		result(num);
		
	}
}
