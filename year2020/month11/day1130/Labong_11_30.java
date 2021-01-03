class Solution {
    public String solution(int a, int b) {
        
        int[] month = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	    String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		
		int total = 0;
		for(int i=0; i<a; i++) {
			total += month[i];
		}
		total += b-1;
		
		return day[total % 7];          
    }
}