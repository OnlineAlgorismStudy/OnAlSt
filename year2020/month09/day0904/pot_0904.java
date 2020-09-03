package study;

import java.util.Scanner;

public class test1 {
	public void maxvalue() {
		// 세 정수 입력을 위한 배열
		int[] arr1 = new int[3];
		// 최대값 저장 변수
		int max = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
			// 현 max값 보다 arr1[i] 값이 더 크다면 max 에 저장
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		System.out.println("최대값 : " + max);
	}
	
	
	public static void main(String[] args) {
		//메서드 호출을 위한 객체 생성
		test1 test1 = new test1();
		test1.maxvalue();

	}
	


}
