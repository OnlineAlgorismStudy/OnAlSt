package year2020.month08;
public class BR_0820 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 3행 5열의 배열을 아래 출력 예와 같이 초기화 한 후 출력하는 프로그램을 작성하시오.
		 * 
		 * 숫자사이의 공백은 3칸으로하고 각 숫자는 2칸으로 오른쪽에 맞추어 출력한다. 예, "%2d   "
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 *  5    8   10    6    4
		 * 11   20    1   13    2
		 *  7    9   14   22    3
		 * ===========================
		 * **************************************************/
		int[][] aryNum = {{5, 8, 10, 6, 4}, {11, 20, 1, 13, 2}, {7, 9, 14, 22, 3}};
		
		for (int[] numbers : aryNum) {
			String line = "";
			for (int number : numbers) {
				line += String.format("%2d", number);
				if (number != numbers[4]) String.format("%3s", " ");
			}
			System.out.println(line);
		}

	}
}
