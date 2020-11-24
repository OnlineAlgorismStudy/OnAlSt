import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BR_1125 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 두 개의 문자열을 입력받아 앞에서부터 정수로 변환 가능한 부분을 변환한 후 두 수의 곱을 출력하는 프로그램을 작성하시오.
		 * 각 문자열의 길이는 100이하이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 123.45 67@12
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 8241
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		while (a.length() > 100) a = sc.next();
		while (b.length() > 100) b = sc.next();
		
		sc.close();
		
		System.out.println(getInt(a)*getInt(b));
		
	}
	
	private static int getInt(String s) {
		int num = 0;
		Pattern pattern = Pattern.compile("^[0-9]*"); //숫자만
		Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
        	num = Integer.parseInt(matcher.group());
        }
		
		return num;
	}
}
