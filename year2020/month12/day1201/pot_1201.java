class Solution {
    public int solution(int n) {
		String s = "";
		while(n != 0) {
			s += String.valueOf(n % 3);
			n = n / 3;
		}
		
		int answer = Integer.parseInt(s,3);
        return answer;
    }
}
