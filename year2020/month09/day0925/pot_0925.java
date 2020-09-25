package study;
import java.util.Scanner;

public class st0925 {
	public static void cal(int num) {
		int result = (int)Math.pow(2, num);
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		cal(num);
	}

}
