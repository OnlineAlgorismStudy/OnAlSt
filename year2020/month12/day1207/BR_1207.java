class Solution {
    public boolean solution(String s) {
		/* **************************************************
		 * 문제.
		 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
		 * 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
		 * 
		 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * a234
		 * 1234
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * false
		 * true
		 * ===========================
		 * **************************************************/
    	boolean answer = true;
    	
    	if (s.length() == 4 || s.length() == 6) {
    		try {
    			Integer.parseInt(s);
    		} catch (Exception e) {
    			answer = false;
    		}
    	} else {
    		answer = false;
    	}
    	
    	
        return answer;
    }
}
