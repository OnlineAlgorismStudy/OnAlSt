package year2020.month10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BR_1008 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 자연수 N을 입력받아 1부터 N까지 출력을 하되 n-1번째 값은 n번째 값을 2로 나눈 몫이 되도록 하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 100
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 1 3 6 12 25 50 100
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
		int next = (int)(list.get(0)/2);
		list.add(0, next);
		if (next != 1) {
			return makeList(list);
		}
		else return list; 
	}
}
