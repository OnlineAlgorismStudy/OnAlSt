class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++) {
            int num = prices[i];
            for(int j=i+1; j<prices.length; j++) {
                if(prices[j] >= num) {
                    answer[i]++;
                } else {
                    answer[i]++;
                    break;
                }
            }
        }
        return answer;
    }
}
