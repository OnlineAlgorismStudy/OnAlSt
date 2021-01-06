package month12;

public class goe_1207 {
    public static boolean solution(String s) {
        boolean answer = false;

        // 알파벳 소문자와 대문자
        String regex = ".*[a-zA-Z].*";

        // 문자열 s의 길이가 4또는 6일때만 작동
        if( s.length() == 4 || s.length() == 6){
            // matches는 정규식을 이용하여 문자열을 검색
            // matches를 이용하여 정규 표현식으로 s에 regex(문자)가 있는지 확인
            if(s.matches(regex)) {
                answer = false;
            } else {
                answer = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a234"));
    }
}
