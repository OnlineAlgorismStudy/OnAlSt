class Solution {
    public boolean solution(String s) {
        if(!(s.length() == 4 || s.length() == 6))
            return false;
        
        boolean numeric = true;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(!(c >= 48 && c <= 57))
                return false;
        }
        return numeric;
    }
}
