package month12;

import java.util.Arrays;
import java.util.Collections;


public class goe_1204 {
    public static String solution(String s) {
        String answer = "";

        String[] str = new String[s.length()];

        for(int i = 0; i < s.length(); i++) {
           str[i] = String.valueOf(s.charAt(i));
        }

        // 기본 정렬 기준과는 다르게 정렬하고 싶다
        // 기본 타입의 배열을 래퍼클래스로 만들어 Comparator를 두번째 인자에 넣어주어 역순으로 정렬
        Arrays.sort(str, Collections.reverseOrder());

        for(int i = 0; i < s.length(); i++) {
            answer += str[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        // 테스트용 메인 함수
        System.out.println(solution("Zbcdefg"));
        //solution("Zbcdefg");
    }
}
