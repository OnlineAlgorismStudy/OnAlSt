import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int tern = 0; // 변환 횟수
        int remove = 0; // 제거된 0의 개수
        
        while(!s.equals("1")) {
            int before = s.length(); // 0을 제거하기 전 길이
            s = s.replace("0", "");
            int after = s.length(); // 0을 제거한 후 길이
            s = Integer.toBinaryString(after);
            
            tern++; // 변환 횟수 증가
            remove += (before - after); // 제거된 0의 개수 증가
        }
        
        answer[0] = tern;
        answer[1] = remove;
        return answer;
    }
}
