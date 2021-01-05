class Solution {
    public int solution(int n) {
        int num = n;
		String str = "";

    	while (num > 0) {
    		str += ""+num%3;
    		num /= 3;
    	}
    	num = Integer.parseInt(str, 3);
    	return num;
    }
}
