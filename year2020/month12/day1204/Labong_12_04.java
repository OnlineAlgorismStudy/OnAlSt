import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
       char[] strArr = s.toCharArray();
		String D ="" , ss="";
		Arrays.sort(strArr);
		
		for(int i= (strArr.length)-1; i >= 0; i--) {
			if(strArr[i] >='a') {
				D += strArr[i];
			}else {
				ss += strArr[i];
			}	
		}
		  return D+ss;
    }
}
