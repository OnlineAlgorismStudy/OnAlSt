package month12;

public class goe_1217 {
    public static long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);

        if(sqrt <= (long)sqrt) {
            answer = (long) ((sqrt+1)*(sqrt+1));
        }else {
            answer = -1;
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(121);
    }
}
