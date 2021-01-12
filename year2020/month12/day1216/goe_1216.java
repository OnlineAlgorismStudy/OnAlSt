package month12;

import java.util.*;

public class goe_1216 {
    public static int[] solution(long n) {
        // 바름님 코드 참고
        int[] answer = new int[Long.toString(n).length()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = (int)(n%10);
            n = (int)(n/10);
            System.out.print(answer[i] + " ");
        }


        return answer;
    }

    public static void main(String[] args) {
        solution(0123);

    }
}
