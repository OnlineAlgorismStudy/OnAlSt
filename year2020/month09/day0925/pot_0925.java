package study;
import java.util.Scanner;

public class st0925 {
	public static void cal(double num) {
		double result = Math.pow(2.0, num);
		System.out.println((int)result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		cal(num);
	}

}
