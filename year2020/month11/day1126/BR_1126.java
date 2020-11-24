import java.util.Scanner;

public class BR_1126 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 정수, 실수, 문자열을 차례로 입력받아서 새로운 문자열에 출력한 후 전체의 길이를 2등분하여 출력하는 프로그램을 작성하시오. 실수는 반올림하여 소수 셋째자리까지 출력하는 것으로 하고, 새로운 문자열의 길이가 홀수일 때는 첫 번째 줄에 한 개를 더 출력한다. 각 문자열의 길이는 30자 이내이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 12345 5.0123 fighting
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 8241
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		String a = Integer.toString(sc.nextInt());
		String b = String.format("%.3f", sc.nextDouble());
		String c = sc.next();
		while (a.length() > 30) a = Integer.toString(sc.nextInt());
		while (b.length() > 30) String.format("%.3f", sc.nextDouble());
		while (c.length() > 30) sc.next();
		
		sc.close();
		
		String s = a + b + c;
		if (s.length()%2 == 0) {
			System.out.println(s.substring(0, s.length()/2));
			System.out.println(s.substring(s.length()/2));
		} else {
			System.out.println(s.substring(0, s.length()/2 + 1));
			System.out.println(s.substring(s.length()/2 + 1));
		}
		
	}
}
