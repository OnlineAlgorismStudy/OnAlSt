package year2020.month09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BR_0909 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 10 이하의 두 개의 양의 정수를 입력받아서 작은 수부터 큰 수까지의 구구단을 차례대로 출력하는 프로그램을 구조화하여 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 3 5
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * == 3dan ==
		 * 3 * 1 =  3
		 * 3 * 2 =  6
		 * 3 * 3 =  9
		 * 3 * 4 = 12
		 * 3 * 5 = 15
		 * 3 * 6 = 18
		 * 3 * 7 = 21
		 * 3 * 8 = 24
		 * 3 * 9 = 27
		 * 
		 * == 4dan ==
		 * 4 * 1 =  4
		 * ...
		 * 5 * 8 = 40
		 * 5 * 9 = 45
		 * ===========================
		 * **************************************************/
		List<Integer> listDan = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int temp1 = sc.nextInt();
		int temp2 = sc.nextInt();
		
		while (temp1 < 1 || temp1 > 10) {
			temp1 = sc.nextInt();
		}
		while (temp2 < 1 || temp2 > 10) {
			temp2 = sc.nextInt();
		}
		
		if (temp1 == temp2) listDan.add(temp1);
		else {
			listDan.add(Math.min(temp1, temp2));
			listDan.add(Math.max(temp1, temp2));
		}
		
		sc.close();
		
		while (listDan.size() < Math.abs(temp1 - temp2) + 1) listDan.add(1, listDan.get(1) - 1);
		for (int dan : listDan) System.out.println(printGugudan(dan));
	}

	private static String printGugudan (int dan) {
		String gugudan = "== " + dan + "dan ==\n";
		
		for (int i = 1; i <= 9; i++) {
			gugudan += dan + " * " + i + " = " + String.format("%2s", dan*i) + "\n";
		}
		
		return gugudan;
	}
}
