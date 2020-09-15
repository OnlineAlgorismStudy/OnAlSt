package question.month09.day0921;

import java.util.Scanner;

public class bangJjo_0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		} // end for
		
		sc.close();
		
		bubbleSort(arr);
		
	} // main
	
	public static void bubbleSort(int arr[]) {
		
		int temp = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(arr[j] < arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} // end if
			} // end for
			for(int k = 0; k < arr.length; k++) {
				System.out.print(arr[k]+" ");
			} // end for
			System.out.println();
		} //  end for
		
	} // bubbleSort

} // class
