import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<numbers.length;i++){
            for(int i2=0; i2<numbers.length; i2++){
                if(i == i2) {
                    continue;
                }
                set.add(numbers[i] + numbers[i2]);
            }          
        }    
        return test(set);
    }
    
    public static int[] test(HashSet set) {
			
	    	System.out.println(set);
	    	List<Integer> list = new ArrayList<Integer>(set);

	    	int[] arr = new int[list.size()];
	    	
	    	for(int i=0; i<list.size(); i++) {
	    		arr[i] = list.get(i);
	    	}
	    	return arr;
	    }
    
}
