package question.month09.day0916;

import java.util.Scanner;

public class bangJjo_0916 {

	public static void printScore(int[][] arr) {

		for (int i = 0; i < 3; i++) {
			int studentSum = 0;
			for (int j = 0; j < 3; j++) {
				studentSum += arr[i][j];
			} // end for
			arr[i][3] = studentSum;
		} // end for

		
		int subjectSum = 0;

		for (int i = 0; i < 3; i++) {
			int total = 0;
			for (int j = 0; j < 3; j++) {
				total += arr[j][i];
			} // end for
			arr[3][i] = total;
			
			subjectSum += total;
			arr[3][3] = subjectSum;
		} // end for

		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <=3; j++) {
				System.out.print(arr[i][j] + " ");
			} // end for
			System.out.println();
		} // end for
		
	} // printScore

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			} // end for
		} // end for

		sc.close();

		printScore(arr);

	} // main

} // class
