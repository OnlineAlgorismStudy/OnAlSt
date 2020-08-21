package year2020.month08;
import java.util.Scanner;

public class BR_0828 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 4행 2열의 배열을 입력받아 가로평균과 세로평균 그리고 전체평균을 출력하는 프로그램을 작성하시오. (소수점 이하는 버림 한다.)
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 16 27
		 * 39 100
		 * 19 88
		 * 61 20
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 21 69 53 40
		 * 33 58
		 * 46
		 * ===========================
		 * **************************************************/
		
		int[][] aryList = new int[4][2];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			aryList[i][0] = sc.nextInt();
			aryList[i][1] = sc.nextInt();
		}
		sc.close();
		
		int leftsum = 0;
		int rightsum = 0;
		String rowsum = "";
		for (int[] ary : aryList) {
			leftsum += ary[0];
			rightsum += ary[1];
			rowsum += ((ary[0]+ary[1])/2) + " ";
		}
		
		System.out.println(rowsum.trim());
		System.out.println((leftsum/4) + " " + (rightsum/4));
		System.out.println((leftsum+rightsum)/8);
		
	}
}
