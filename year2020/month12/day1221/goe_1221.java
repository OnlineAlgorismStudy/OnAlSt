package month12;

public class goe_1221 {
    public static int solution(int num) {
        int answer = 0;
        Long n = (long)num;

        while (n != 1) {
            if (n % 2 == 0){
                n = n/2;
                answer++;
                if(answer > 500){
                    return -1;
                }
            } else {
                n = (n * 3) + 1;
                answer++;
                if(answer > 500){
                    return -1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println( solution(626331));
    }
}
