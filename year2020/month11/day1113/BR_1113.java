import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BR_1113 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 20자 이하인 한 개의 문자열을 입력받아서 첫 줄에는 정수로 변환하여 2배한 값을 출력하고, 다음 줄에는 실수로 변환한 값을 반올림하여 소수 둘째자리까지 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 50.1*34
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 100
		 * 50.10
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		String input = "";
		int num1 = 0;
		double num2 = 0.00;
		while (input.length() < 1 || input.length() > 20) {
			input = sc.next();
			if (input.length() <= 20) {
				if (getDouble(input) > -1.0) {
					num1 = getInt(input);
					num2 = getDouble(input);
					break;
				}
			}
		}
		
		sc.close();

		System.out.println(num1*2);
		System.out.println(String.format("%.2f", num2));
		
	}
	
	private static int getInt(String input) {
		int num = -1;
		
		Pattern pattern = Pattern.compile("^[0-9]*"); //숫자만

        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
        	num = Integer.parseInt(matcher.group());
        }
		
		return num;
	}
	
	private static double getDouble(String input) {
		double num = -1.0;
		
		Pattern pattern = Pattern.compile("^[0-9]+.[0-9]*"); //소수점과 숫자만

		Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
        	num = Double.parseDouble(matcher.group());
        }
		
		return num;
	}
}
