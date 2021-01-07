package month12;

public class goe_1208 {
    public static String solution(int n) {
        String answer = "";

        /* StringBuilder 는 StringBuffer 와 같은 역할을 한다. 다만 StringBuilder는 쓰레드의 동기화가 빠져있다.
           고로 더 빠른 성능을 보이며 단일 스레드 환경에서만 사용이 가능하다.
        */
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            if(i%2 == 0) {
                answer = sb.append("수").toString();
            } else {
                answer = sb.append("박").toString();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // 테스트용 함수 1점
        System.out.println(solution(3));
    }
}
