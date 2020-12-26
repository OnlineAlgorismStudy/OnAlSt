import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        HashSet<Integer> hash = new HashSet<Integer>();
		for(int i = 1 ; i < n; i++) {
			if(n % i == 0) {
				hash.add(n);
				hash.add(i);		
            }
		}
		for(Integer data : hash) {
			answer += data;
		}
        return answer;
    }
}
