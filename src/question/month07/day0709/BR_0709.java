import java.util.Scanner;

public class BR_0709 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고,
		 * "Continue? "에서 하나의 문자를 입력받아
		 * 그 문자가 'Y' 나 'y' 이면 작업을 반복하고
		 * 다른 문자이면 종료하는 프로그램을 작성하시오.
		 * 
		 * (넓이는 반올림하여 소수 첫째자리까지 출력한다.)​​
		 * 
		 * 입·출력 예.
		 * ===========================
		 * Base = 11
		 * Height = 5
		 * Triangle width = 27.5
		 * Continue? Y
		 * Base = 10
		 * Height = 10
		 * Triangle width = 50.0
		 * Continue? N
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		String cont = "Y";
		
		while (true) {
			if (!cont.equals("Y") && !cont.equals("y")) break;
			
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			System.out.println("Triangle width = " + (double)(base*height)/2.0);
			
			System.out.print("Continue? ");
			cont = sc.next();
		}
	    
	    sc.close();
	}
	
}
