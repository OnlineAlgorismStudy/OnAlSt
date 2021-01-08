//방법알기전,,
class Solution {
    public long solution(long n) {
        int answer = 0;
       //소수점 기준으로 뒤로 2번째 자리수가 있다면 실수
        //소수점 위치 찾기
        int n2 = String.valueOf(Math.sqrt(n)).indexOf('.');
        //try catch를 활용해서 소수점 기준으로 2번째 자리수가 존재하는지 확인
        //오류미발생 >> 실수
        //오류발생 >> 정수
		try {
            //소수점 기준 뒤 2번째 자리가 0~9 라면
			if(0<= String.valueOf(Math.sqrt(n)).charAt(n2+2) && String.valueOf(Math.sqrt(n)).charAt(n2+2) >=9) {
				answer = -1;
			}
		} catch (Exception e) {//정수일경우 (제곱근 + 1) 를  제곱해주기
            //math 메서드(sqrt,pow) 활용하기
            answer = (int)Math.pow(Math.sqrt(n)+1, 2);
		}
        return answer;
    }
}
//방법알고난후!!!!!!!!!!!
class Solution {
    public long solution(long n) {
		int answer = 0;
		if(Math.pow((int)Math.sqrt(n), 2) == n) {
			answer = (int)Math.pow(Math.sqrt(n)+1, 2);
		}else {
			answer = -1;
		}
        return answer;
    }
}
