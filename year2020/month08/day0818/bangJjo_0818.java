package question.month08.day0818;

import java.util.Scanner;

public class bangJjo_0818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[20];
		int num = 0;
		int score = 0;
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			score = sc.nextInt();
			arr[i] = score;
		} // end for
		sc.close();
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num-1; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} // end if
			} // end for
		} // end for
		
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		} // end for
	} // main

} // class
 