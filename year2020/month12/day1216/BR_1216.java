class Solution {
	public int[] solution(long n) {
		/* **************************************************
		 * 문제.
		 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
		 * 
		 * n은 10,000,000,000이하인 자연수입니다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 12345
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * [5,4,3,2,1]
		 * ===========================
		 * **************************************************/
		int len = Long.toString(n).length();
		int[] answer = new int[len];
		
		for (int i = 0; i < len; i++) {
			answer[i] = (int) Long.parseLong(String.valueOf(Long.toString(n).charAt(len-i-1)));
		}
        return answer;
    }
}
