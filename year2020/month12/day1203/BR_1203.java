class Solution {
    public long solution(int a, int b) {
		/* **************************************************
		 * 문제.
		 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
		 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
		 * 
		 * a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
		 * a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
		 * a와 b의 대소관계는 정해져있지 않습니다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * abcde
		 * qwer
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * c
		 * we
		 * ===========================
		 * **************************************************/
    	long answer = 0;
    	
    	if(a == b) return (long)a;
    	else {
    		answer = addAll(a, b);
    	}
    	
        return answer;
    }
    
    private long addAll(int a, int b) {
    	long l = 0;
    	int big = 0;
    	int small = 0;
    	
    	if (a > b) {
    		big = a;
    		small = b;
    	} else {
    		big = b;
    		small = a;
    	}
    	
    	while (big >= small) {
    		l += big;
    		big--;
    	}
    	
    	return l;
    }
}
