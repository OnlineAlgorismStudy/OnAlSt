package study_0824;

import java.util.Scanner;

public class test {
	//계산 메서드
	public double circle(double a) {
		double result = a * a * 3.14;
		//계산값 리턴
		return result;
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//메서드 사용을 위한 객체 생성
		test ForMet = new test();
		//반지름이 실수일수도있겠죠
		double data1 = sc.nextDouble();
		//이번엔 리턴값이 있는 메서드
		double data2 = ForMet.circle(data1);
		//소수점 2째자리 출력
		System.out.printf(".2lf", data2);
	}
}
