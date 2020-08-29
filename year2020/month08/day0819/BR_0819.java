package year2020.month08;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BR_0819 {
	private static String CAP_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고
		 * 
		 * 영문 대문자들에 대하여 1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * A B C F F F B Z !
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * A : 1
		 * B : 2
		 * C : 1
		 * F : 3
		 * Z : 1
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		String input = "";
		String tmp;
		while (CAP_LETTERS.indexOf((tmp = sc.next())) > -1) {
			input += tmp;
		}
		sc.close();

		Map<String, Object> mapResult = new HashMap<String, Object>();
		
		String letters = fnArrange(input.split(""));
		int i = 0;
		while (i < letters.length()) {
			String letter = letters.substring(i, i+1);
			int end = letters.lastIndexOf(letter);
			int srt = letters.indexOf(letter);
			mapResult.put(letter, end-srt+1);
			i = end+1;
		}
		
		for (String key : mapResult.keySet()) {
			System.out.println(key + " : " + mapResult.get(key));
		}
		

	}
	
	private static String fnArrange(String[] letters) {
		String result = "";
		for (int i = 0; i < letters.length-1; i++) {
			for (int j = i+1; j < letters.length; j++) {
				if (CAP_LETTERS.indexOf(letters[j]) < CAP_LETTERS.indexOf(letters[i])) {
					String tmp = letters[j];
					letters[j] = letters[i];
					letters[i] = tmp;
				}
			}
		}
		
		for (String letter : letters) {
			result += letter;
		}
		return result;
	}
}
