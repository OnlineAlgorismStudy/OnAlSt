class Solution {
      public String solution(String s) {
          String answer = "";
          
          if(s.length()%2==0) {
              answer = s.substring(s.length()/2-1, s.length()/2+1);
          } else {
              answer = s.substring(s.length()/2,s.length()/2+1);
          } // end if
          
          return answer;
      } // end solution
    } // end class

