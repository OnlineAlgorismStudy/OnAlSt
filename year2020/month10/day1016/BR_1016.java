import java.util.Scanner;

public class BR_1016 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 10 이하의 자연수 N을 입력받아 주사위를 N번 던져서 나올 수 있는 모든 경우를 출력하되 중복되는 경우에는 앞에서부터 작은 순으로 1개만 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 3
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 1 1 1
		 * 1 1 2
		 * ...
		 * 1 1 6
		 * 1 2 2
		 * 1 2 3
		 * ...
		 * 5 6 6
		 * 6 6 6
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while (n < 1 || n > 10) {
			n = sc.nextInt();
		}
		
		sc.close();
		
		int[] pos = new int[n];
		int i = 0;
		int[] result = null;
		while (i < 7) {
			if (result != null) {
				String strResult = "";
				for (int j = 0; j < result.length; j++) {
					strResult += result[j] + " ";
				}
				System.out.println(strResult.trim());
				result = addOne(pos);
			} else {
				i++;
				for (int j = 0; j < n; j++) {
					pos[j] = i;
				}
				result = pos;
			}
		}
		
	}
	
	private static int[] addOne (int[] pos) {
		int n = pos.length;
		if (pos[n-1] < 6) {
			pos[n-1]++;
			return pos;
		} else if (pos[0] == 6 && pos[n-1] == 6) {
			return null;
		} else {
			for (int i = n-1; i >= 0; i--) {
				if (i == 0) {
					return null;
				}else if (pos[i] < 6) {
					pos[i]++;
					return pos;
				} else {
					pos[i] = pos[i-1]+1;
					continue;
				}
			}
		}
		return null;
	}
}
