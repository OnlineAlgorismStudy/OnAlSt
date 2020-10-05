package september;

import java.util.Scanner;

public class Labong_09_29 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		final int num = 7;
		int[] cnt = new int[num];
		
		for(int i=0; i<cnt.length; i++) {
			cnt[i] = sc.nextInt();
		}
		arrays(cnt);
		
	}
	
	static void arrays(int[] arr) {
		
		int temp = 0;
		
		for(int i=0; i<3; i++) {
			for(int i2=0; i2<arr.length-1; i2++	) {
				if(arr[i2]> arr[i2+1]) {
					temp = arr[i2];
					arr[i2] = arr[i2+1];
					arr[i2+1] = temp; 
				}
			}
		}
		for(int i3=0; i3<arr.length; i3++) {
			System.out.print(arr[i3] + " ");
		}
	}

}
