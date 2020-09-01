package year2020.month10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BR_1009 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 자연수 N을 입력받아 N이 홀수인 경우에는 1부터 N까지의 홀수를 짝수인 경우는 2부터 N까지의 짝수를 모두 출력하는 프로그램을 재귀함수로 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 15
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 1 3 5 7 9 11 13 15
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n < 1) {
			n = sc.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(n);
		
		list = makeList(list);
		
		String strList = "";
		for (int x : list) {
			strList += x + " ";
		}
		System.out.println(strList.trim());
		sc.close();
		
	}
	
	private static List<Integer> makeList(List<Integer> list) {
		int next = list.get(0) - 2;
		list.add(0, next);
		if (next > 2) {
			return makeList(list);
		}
		else return list; 
	}
}
