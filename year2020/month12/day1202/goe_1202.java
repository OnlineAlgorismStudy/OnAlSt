package month12;

public class goe_1202 {

    public static String solution(String s) {
        String answer = "";

        // s의 길이가 짝수일 경우와 홀수일 경우를 나눔
        if(s.length() % 2 == 0){
            // 짝수일 경우, 문자열 가운데 위치를 기준으로 두개의 문자를 가져옴
            // substring은 첫번째 문자는 범위에 포함이 되지만 끝문자는 포함이 되지 않는다.
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }else {
            // 홀수일 경우, 문자열 가운데 문자를 가져옴
            answer = s.substring(s.length()/2, s.length()/2+1);
        }

        return answer;
    }
    public static void main(String[] args) {

        System.out.println(solution("abcde"));
       // System.out.println(solution("qwer"));
    }
}
