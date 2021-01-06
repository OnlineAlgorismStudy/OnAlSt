import java.util.*;

public class Solution {
    //나머지 값을 계속 더해주기
    public int solution(int n) {
        int answer = 0;
        while(n!=0){ 
            // 나머지값더해주기
            answer += n % 10;
            //n 을 몫으로 초기화
            n = n / 10;    
            
    
        }
        return answer;
    }
}
