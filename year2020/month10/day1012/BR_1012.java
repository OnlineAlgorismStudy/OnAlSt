package year2020.month10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BR_1012 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 자연수 N과 M을 입력받아서 주사위를 N번 던져서 나온 눈의 합이 M이 나올 수 있는 모든 경우를 출력하는 프로그램을 작성하시오.
		 * 단, N은 10 이하의 정수이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 3 10
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 1 3 6
		 * 1 4 5
		 * 1 5 4
		 * 1 6 3
		 * 2 2 6
		 * 2 3 5
		 * ...
		 * 6 2 2
		 * 6 3 1
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n < 1) {
			n = sc.nextInt();
		}
		int m = sc.nextInt();
		
		List<String> list = makeList(null, n);
		
		for (String numbers : list) {
			if (addAll(numbers) == m) {
				System.out.println(numbers);
			}
		}
		sc.close();
		
	}
	
	private static List<String> makeList(List<String> orgList, int times) {
		List<String> newList = new ArrayList<String>();
		if (null == orgList || orgList.isEmpty() || orgList.size() == 0) {
			for (int i = 1; i <= 6; i++)
				newList.add(Integer.toString(i));
		} else {
			for (int i = 0; i < orgList.size(); i++) {
				for (int j = 1; j <= 6; j++) {
					newList.add(newList.size(), orgList.get(i) + " " + Integer.toString(j));
				}
			}
		}
		if (times > 1) return makeList(newList, times - 1);
		else return newList;
	}
	
	private static int addAll(String strNum) {
		String[] numbers = strNum.split(" ");
		int total = 0;
		for (String number : numbers) {
			total += Integer.parseInt(number);
		}
		return total;
	}
}
