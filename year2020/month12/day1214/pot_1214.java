//짝수번째 알파벳은 대문자
//홀수번째 알파벳은 소문자
import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            String str = String.valueOf(s.charAt(i));
            if((" ").equals(str)){
                index = i + 1;
                answer += " ";
            }else{
                if((i-index) % 2 == 0){
                    answer += str.toUpperCase();
                }else{
                    answer += str.toLowerCase();
                }
            }
    }
        return answer;
}
}
