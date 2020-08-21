package year2020.month08;
import java.util.Scanner;

public class BR_0831 {
	private static String CAP_LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 3행 5열의 2차원 문자배열을 선언하고 차례로 대문자를 입력 받은 후 소문자로 바꾸어서 공백으로 구분하여 출력하는 프로그램을 작성하시오.
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * A B C D E
		 * F G H I J
		 * K L M N O
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * a b c d e
		 * f g h i j
		 * k l m n o
		 * ===========================
		 * **************************************************/
		
		char[][] aryList = new char[3][5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			char input;
			for (int j = 0; j < 5; j++) {
				input = sc.next().charAt(0);
				if (CAP_LIST.indexOf(input) < 0) {
					System.out.println("알파벳 대문자만 입력하세요.");
					j--;
				}
				else aryList[i][j] = (char) (input+32);
			}			
		}
		
		sc.close();
		
		for (char[] ary : aryList) {
			System.out.println(String.format("%s %s %s %s %s", ary[0], ary[1], ary[2], ary[3], ary[4]));
		}
		
	}
}
