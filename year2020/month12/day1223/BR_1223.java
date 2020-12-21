class Solution {
		/* **************************************************
		 * 문제.
		 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
		 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
		 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
		 * 
		 * x는 1 이상, 10000 이하인 정수입니다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 10
		 * 12
		 * 11
		 * 13
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * true
		 * true
		 * false
		 * false
		 * ===========================
		 * **************************************************/
	public boolean solution(int x) {
        boolean answer = true;
        
        if ((x % divNum(x)) != 0) answer = false;
        
        return answer;
    }
	
	private int divNum(int x) {
		int num = 0;
		String str = Integer.toString(x);
		
		for (int i = 0; i < str.length(); i++) {
			num += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return num;
	}
}
