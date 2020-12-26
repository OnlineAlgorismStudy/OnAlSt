class Solution {
    public boolean solution(String s) {
        boolean answer = true;
		try {
			int a = Integer.parseInt(s);
		} catch (Exception e) {
			answer = false;
        }
        
       return answer;
	}
}
