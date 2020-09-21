package study;

import java.util.Scanner;

public class st0922 {
	public static void cal(int num1, int num2) {
		// math.pow 는 double 형 >> 형변환
		int result1 = num1 - num2;
		int result2 = num1 + num2;
		int squ = (int) Math.pow(result1, 2);
		int cube = (int) Math.pow(result2, 3);
		System.out.println("( " + num1 + " - " + num2 + " )" + " ^ " + "2" + " = " + squ);
		System.out.println("( " + num1 + " + " + num2 + " )" + " ^ " + "3" + " = " + cube);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		cal(num1, num2);
	}

}
