package study;

import java.util.Scanner;

public class study0916 {
	public void cal(int[][] arr1) {
		int result = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length - 1; j++) {
				System.out.print(arr1[i][j] + " ");
				result += arr1[i][j];
			}
			arr1[i][arr1.length] = result;
			System.out.println(arr1[i][arr1.length]);
			result = 0; // 값 초기화
		}
		//00 01 02 03
		//10 11 12 13
		//20 21 22 23
		//arr1.length = 3
		//arr1[i].length =4
		int sum = 0;
		for (int i = 0; i < arr1.length+1; i++) { 
			for (int j = 0; j < arr1.length; j++) {
				sum += arr1[j][i];
			}
			System.out.print(sum+" ");
			sum = 0;
		}

	}

	public static void main(String[] args) {
		int[][] arr1 = new int[3][4];
		Scanner sc = new Scanner(System.in);
		study0916 st = new study0916();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length - 1; j++) {
				arr1[i][j] = sc.nextInt();
			}

		}
		st.cal(arr1);

	}

}
