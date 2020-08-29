package year2020.month08;
import java.util.Scanner;

public class BR_0824 {
	private static int SUBJ_CNT = 4;
	private static int STUD_CNT = 5;
	private static int SUCC = 80;
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서 각 개인별로 평균이 80 이상이면“합격” 그렇지 않으면“불합격”을 출력하고 합격한 사람의 수를 출력하는 프로그램을 작성하시오.
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 85 67 95 65
		 * 80 95 86 56
		 * 100 98 67 86
		 * 95 76 84 65
		 * 67 86 90 76
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * fail
		 * fail
		 * pass
		 * pass
		 * fail
		 * Successful : 2
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		String[] result = new String[STUD_CNT];
		int succ = 0;
		for (int i = 0; i < STUD_CNT; i++) {
			int tmpSum = 0;
			for (int j = 0; j < SUBJ_CNT; j++) {
				tmpSum += sc.nextInt();
			}
			if (tmpSum >= SUCC*SUBJ_CNT) {
				result[i] = "pass";
				succ++;
			} else {
				result[i] = "fail";
			}
		}
		
		sc.close();
		
		for (String str : result) {
			System.out.println(str);
		}
		System.out.println("Successful : " + succ);

	}
}
