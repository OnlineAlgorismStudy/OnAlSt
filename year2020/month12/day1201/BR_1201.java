class Solution {
    public int solution(int n) {
		/* **************************************************
		 * 문제.
		 * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
		 * 
		 * n은 1 이상 100,000,000 이하인 자연수입니다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 45
		 * 125
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 7
		 * 229
		 * ===========================
		 * **************************************************/
        return toRevDec(n);
    }
    
    private int toRevDec(int dec) {
    	String ternary = "";
    	while (dec > 0) {
    		ternary += Integer.toString(dec%3);
    		dec /= 3;
    	}
    	return Integer.parseInt(ternary, 3);
    }
}
