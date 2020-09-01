package year2020.month09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BR_0916 {

	private static List<List<Integer>> scores = new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 3명 학생의 3과목 점수를 입력받아 각 과목별 학생별 총점을 출력하는 구조화된 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 50 80 100
		 * 96 88 66
		 * 100 85 90
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 50 80 100 230
		 * 96 88 66 250
		 * 100 85 90 275
		 * 246 253 256 755
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < 3; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(sc.nextInt());
			temp.add(sc.nextInt());
			temp.add(sc.nextInt());
			scores.add(temp);
		}
		
		sc.close();
		
		for (List<Integer> student : scores) {
			printScores(scores.set(scores.indexOf(student), calcScores(student)));
			
		}
		printTotal(scores);
	}
	
	private static List<Integer> calcScores(List<Integer> student) {
		int total = 0;
		for (int eachScore : student) {
			total += eachScore;
		}
		student.add(total);
		return student;
	}
	
	private static void printScores(List<Integer> student) {
		
		String result = "";
		for (int score : student) {
			result += score + " ";
		}
		System.out.println(result.trim());
	}
	
	private static void printTotal(List<List<Integer>> scores) {
		String total = "";
		for (int i = 0; i < scores.get(0).size(); i++) {
			total += (scores.get(0).get(i)+scores.get(1).get(i)+scores.get(2).get(i)) + " ";
		}
		System.out.println(total.trim());
	}

}
