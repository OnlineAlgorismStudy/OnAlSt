import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<skill.length(); i++) {
            char c = skill.charAt(i);
            map.put(c, i);
        }
        
        for(int i=0; i<skill_trees.length; i++) {
            int check = 0;
            boolean b = true;
            for(int j=0; j<skill_trees[i].length(); j++) {
                char c = skill_trees[i].charAt(j);
                if(map.containsKey(c)) {
                    if(map.get(c) != check) {
                        b = false;
                        break;
                    } else {
                        check++;
                    }
                }
            }
            if(b == true) answer++;
        }
        return answer;
    }
}
