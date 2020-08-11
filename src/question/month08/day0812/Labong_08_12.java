package august;

import java.util.Scanner;

public class Labong_08_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int odd = 0;
		int even = 0;
		
		for(int i=0; i< num.length; i++) {
			num[i] = sc.nextInt();
			
			if((i+1)%2 == 0) {
				even += num[i];
			}else {
				odd += num[i];
			}
		}
		System.out.println("odd : " + odd +"\neven : " + even);
	}

}
