class Solution {
    public boolean solution(int x) {
        //나머지값 저장을 위한 변수
        int y = 0;
        //양의정수 값 z에 저장
        int z = x;
        boolean answer = true;
        //x가 0이 될때까지 나머지값 계속 더해주기
		while(x != 0) {
			y = y +(x % 10); 
			x = x / 10;	
		}
        //z가 y로 나누어지지 않으면 하샤드수 아님!
		if((z % y) != 0) {
			answer = false; 
		}
        return answer;
    }
}
