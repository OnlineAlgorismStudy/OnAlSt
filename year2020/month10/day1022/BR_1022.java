import java.util.Scanner;
import java.util.regex.Pattern;

public class BR_1022 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 문자열을 입력받고 정수를 입력 받아서 문자열의 맨 뒤부터 정수만큼 출력하는 프로그램을 작성하시오.
		 *  만약 입력받은 정수가 문자열의 길이보다 크다면 맨 뒤부터 맨 처음까지 모두 출력한다.
		 * (문자열 길이는 최대 100자 이하이다. )
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * korea 3
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * aer
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] tmp = input.split(" ");
		int len = 0;
		if (tmp.length < 2 || !Pattern.matches("^[0-9]*$", (tmp[1]))) {
			while((len = sc.nextInt()) > 100) {
				continue;
			}
		} else {
			len = Integer.parseInt(tmp[1]);
		}
		sc.close();
		
		StringBuffer sb = new StringBuffer(tmp[0]);
		input = sb.reverse().toString();
		if (len > input.length()) len = input.length();
		
		System.out.println(sb.substring(0, len));
		
	}
}
