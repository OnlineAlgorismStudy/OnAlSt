import java.util.Scanner;

public class BR_1111 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 100개 이하의 문자로 구성된 한 개의 문자열을 입력받아서 그 문자열에 문자 'c'와 문자열 "ab"의 포함여부를 "Yes", "No"로 구분하여 출력예처럼 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * abdef
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * No Yes
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		while (input.length() > 100) input = sc.next();
		
		sc.close();

		String[] result = {"No", "No"};
		if (input.indexOf("c") > -1) result[0] = "Yes";
		if (input.indexOf("ab") > -1) result[1] = "Yes";
		
		System.out.println(result[0] + " " + result[1]);
		
	}
}
