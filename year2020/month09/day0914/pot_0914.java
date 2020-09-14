package study;

import java.util.Scanner;

public class study0915 {
	public void cal(int data) {
		int k = 1;
		int[][] arr = new int[data][data];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		study0915 st = new study0915();
		int data = sc.nextInt();
		st.cal(data);
	}

}
