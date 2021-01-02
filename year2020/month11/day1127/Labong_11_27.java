import java.util.HashSet;

class Solution {
    public HashSet solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<numbers.length;i++){
            for(int i2=0; i2<numbers.length; i2++){
                if(i == i2) {
                    continue;
                }
                set.add(numbers[i] + numbers[i2]);
            }       
        }  
        return set;
    }
}