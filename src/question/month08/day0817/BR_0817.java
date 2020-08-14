package month08;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BR_0817 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 정수를 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력 받은 개수를 출력한 후
		 * 입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을,
		 * 짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력되는 정수의 개수는 100개 이하이다. 
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 8 10 5 15 100 0
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 5
		 * 4 5 10 30 50
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int inputCnt = 0;
		List<Integer> listNum = new ArrayList<Integer>();
		while((input = sc.nextInt()) != 0 && inputCnt < 100) {
			if (input%2 == 0) {
				//짝수인경우 2로 나눈 몫
				listNum.add(input/2);
			} else {
				listNum.add(input*2);
			}
			inputCnt++;
		}
		
		String result = "";
		for (int num : listNum) {
			result += num + " ";
		}
		System.out.println(listNum.size());
		System.out.println(result.trim());
		
		sc.close();

	}
}
