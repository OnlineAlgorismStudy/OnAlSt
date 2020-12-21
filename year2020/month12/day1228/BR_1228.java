import java.util.Scanner;

class Solution {
		/* **************************************************
		 * 문제.
		 * 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
		 * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
		 * 
		 * n과 m은 각각 1000 이하인 자연수입니다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 5 3
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * *****
		 * *****
		 * *****
		 * ===========================
		 * **************************************************/
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String line = "";
        for (int i = 0; i < a; i++) {
        	line += "*";
        }
        
        for (int i = 0; i < b; i++) {
        	System.out.println(line);
        }
    }
}
