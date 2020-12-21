class Solution {
	public long solution(long n) {
		/* **************************************************
		 * 문제.
		 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
		 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
		 * 
		 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 121
		 * 3
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 144
		 * -1
		 * ===========================
		 * **************************************************/
		long answer = 0;
		
		if (isInteger((double)Math.sqrt(n))) {
			answer = (long) Math.pow(Math.sqrt(n)+1, 2);
		} else {
			answer = -1;
		}
		
        return answer;
    }
	
	private boolean isInteger(double n) {
		String s = Double.toString(n);
		if (Long.parseLong(s.substring(s.indexOf(".")+1)) > 0) return false;
		else return true;
	}
}
