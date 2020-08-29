import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BR_0811 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 95 100 88 65 76 89 58 93 77 99
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 100 99 95 93 89 88 77 76 65 58
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		
		for (int i = 0; i < 10; i++) {
			input[i] = sc.nextInt();
		}
		
		sc.close();
		System.out.println(printResult(input));
    }
	
	private static String printResult(int[] numbers) {
		String result = "";
		List<Integer> listNum = new ArrayList<Integer>();
		for (int number : numbers) {
			if (listNum.isEmpty()) listNum.add(number);
			else {
				for (int i = 0; i < listNum.size(); i++) {
					if (number >= listNum.get(i)) {
						listNum.add(i, number);
						break;
					}
					else if (i+1 == listNum.size()) {
						listNum.add(number);
						break;
					}
				}
			}
		}
		
		for (int number : listNum) {
			result += number + " ";
		}
		
		return result.trim();
	}
}
