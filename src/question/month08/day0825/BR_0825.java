package year2020.month08;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BR_0825 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 학생들의 점수를 입력을 받다가 0이 입력되면 그 때까지 입력받은 점수를 10점 단위로 구분하여 점수대별 학생 수를 출력하는 프로그램을 작성하시오.
		 * (1명도 없는 점수는 출력하지 않는다.)
		 * 학생은 최대 100명이하이다.
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 63 80 95 100 46 64 88 0
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 100 : 1 person
		 * 90 : 1 person
		 * 80 : 2 person
		 * 60 : 2 person
		 * 40 : 1 person
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		Map<String, Object> mapResult = new HashMap<String, Object>();
		
		int input = 0;
		while ((input = sc.nextInt()) != 0) {
			String key = Integer.toString((input/10)*10);
			if (mapResult.containsKey(key)) {
				mapResult.put(key, (int)mapResult.get(key)+1);
			} else {
				mapResult.put(key, 1);
			}
		}
		sc.close();
		
		for (int i = 100; i > 0; i -= 10) {
			if (mapResult.containsKey(Integer.toString(i))) {
				System.out.println(i + " : " + mapResult.get(Integer.toString(i)) + " person");
			}
		}
	}
}
