package homework;

import java.util.Scanner;

public class badak_0811 {

	/*
	 * 0811
	 * 
	 * 10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
	 * 
	 * 
	 * -입력 예 95 100 88 65 76 89 58 93 77 99 -출력 예 100 99 95 93 89 88 77 76 65 58
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = i+1 ; j < a.length ; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
