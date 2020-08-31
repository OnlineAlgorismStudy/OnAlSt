package study_0824;

import java.util.Scanner;

public class test {
	// 5명 4과목 입력
	// 학생의 평균 출력 > 80점 이상이면 success or fail
	// 평균 이상 수 count
	public static void main(String[] args) {
		int[][] score = new int[5][4];
		double result = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print("입력 : ");
				score[i][j] = sc.nextInt();
			}
			System.out.println("");
		}

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result += score[i][j];
			}
			if ((result / 4) >= 80) {
				System.out.println("pass");
				count++;
			} else {
				System.out.println("fail");
			}
			result = 0;
		}
		System.out.println("Successful : " + count);

	}

}
