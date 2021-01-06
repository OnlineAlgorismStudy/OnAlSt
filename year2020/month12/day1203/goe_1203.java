package month12;

public class goe_1203 {
    public static long solution(int a, int b) {
        long answer = 0;

        if( b > a) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = a; i >= b; i--) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트용 메인 함수
        System.out.println( solution(5,3));
    }
}
