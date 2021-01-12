package month12;
import java.util.*;

public class goe_1215 {
    public static int solution(int n) {
        int answer = 0;

        for(int i = 0; i < 100000000; i++){
            answer += n%10;
            n = n/10;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println( solution(987));
    }
}
