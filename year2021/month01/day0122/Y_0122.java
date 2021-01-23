import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push('(');
            } else {
                if(stack.isEmpty())
                    return false;
                stack.pop();
            }
        }
        
        if(stack.isEmpty()) return true;
        else return false;
    }
}
