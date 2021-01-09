class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        //31 29 31 30 31 30 31 31 30 31 30 31
        int sum = 0;
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        for (int i=1; i<a; i++) {
            if (i==4 || i==6 || i==9 || i==11) {
                sum += 30;
            } else if (i == 2) {
                sum += 29;
            } else {
                sum += 31;
            } // end if
        } // end for
        sum += b+4;
        answer = week[sum%7];
        
        return answer;
    } // end main
} // end class
