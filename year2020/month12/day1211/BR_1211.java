class Solution {
	public int solution(int n) {
		/* **************************************************
		 * 문제.
		 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
		 * 
		 * n은 0 이상 3000이하인 정수입니다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 12
		 * 5
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 28
		 * 6
		 * ===========================
		 * **************************************************/
		int answer = 0;
		
		int max = n;
		int div = 1;
		
		if (n == 0) answer = 0;
		else if (n == 1) answer = 1;
		else {
			while (true) {
				if (n % div == 0) {
					if (max == n) max = n / div;
					answer += div;
				}
				if (div > max) break;
				div++;
			}
			
			if (div != n) answer += n;
		}
		
        return answer;
    }
}
