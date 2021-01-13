public class Solution {
    public int solution(int n) {
        String s = "";
 
        while(n != 0){
 
            //3진법 변환
            if( (n % 3) < 10 ) {
 
                s = (n % 3) + s;
 
                n /= 3;
            } // end if
  
        } // end while
 
 
        int res = 0;
        int r = 1;
        
        for(int i=0; i<s.length(); i++) {
            res += Integer.parseInt(s.charAt(i)+"")*r;
            r*=3;
        } // end for
 
        return res;
    } // end solution
} // end class
