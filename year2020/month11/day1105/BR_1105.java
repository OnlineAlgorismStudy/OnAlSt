import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BR_1105 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 5개의 단어를 입력받아 모든 단어를 입력받은 역순으로 출력하는 프로그램을 작성하시오.
		 * 각 단어의 길이는 30 이하이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * dog
		 * cat
		 * chick
		 * calf
		 * goat
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * goat
		 * calf
		 * chick
		 * cat
		 * dog
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<String>();
		
		int cnt = 0;
		while (cnt < 5) {
			String input = sc.nextLine();
			if (input.length() <= 100) {
				list.add(input);
				cnt++;
			}
		}
		
		sc.close();
		//1번 방법
		ListIterator<String> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		/*
		//2번 방법
		Collections.reverse(list);
		for (String sb : list) {
			System.out.println(sb);
		}
		*/
		
		
	}
}
