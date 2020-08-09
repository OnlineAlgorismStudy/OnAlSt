package august;

import java.util.Scanner;

public class Labong_08_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int max = 10000;
		int min = 100;
		
		for(int i=0; i < num.length;) {		
			num[i] = sc.nextInt();
			if(num[i] < 1 || num[i] > 10000) {
				continue;
			}
			i++;
		}
		
		for(int k=0; k<num.length;k++) {
			if(100 <= num[k] && max > num[k]) {
				max = num[k];
			}else if(100 > num[k] && min > num[k]){
				min = num[k];		
			}
		}
		if(max == 10000) {max = 100;}
		
		System.out.println(min +" " + max);
	}

}
