package year2021.month1;

import java.util.Arrays;

public class goe_0111 {
    public static int[] solution(int[] prices) {
        int[] answer = prices;
        int sec = 0;

        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                if(prices[i] <= prices[j]) {
                    sec++;
                } else {
                    sec++;
                    break;
                }
            }
            prices[i] = sec;
            sec = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,2,3,1})));
        // 1, 2, 3, 2, 3, 1 경우 5 4 1 2 1 0
    }
}
