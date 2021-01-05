package month12;

import java.util.ArrayList;
import java.util.List;

public class goe_1201 {
    public static int solution(int n) {
        int answer = 0;

        // 3진수로 변환한 것을 넣기 위한 리스트
        List list = new ArrayList();

        int remain, remain2;

        // 매개변수 n을 3진수로 변환
        while (n > 0) {
            remain = n;
            remain2 = remain % 3;
            list.add(remain2);

            remain = n / 3;
            n = remain;
        }

        // 3진수로 변환한 수를 넣기 위한 배열
        int[] array = new int[list.size()];

        // 10진수로 변환을 위해 위 배열을 역순으로 만든다.
        // 역순으로 두기 위한 새로운 배열 선언
        int[] array2 = new int[list.size()];

        // list에 있는 요소들을 불러와 array 정수 배열에 저장
        for(int i = 0; i < array.length; i++){
            array[i] = (int) list.get(i);
        }

        // array 정수 배열을 array2에 역순으로 저장
        for(int i = 0; i < array.length; i++) {
            array2[(array.length-1) - i] = array[i];
        }

        // 10진법으로 변환
        for(int i = 0; i < array2.length; i++){
            answer += array2[i] * Math.pow(3, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트용 메인 함수!
        System.out.println(solution(45));
    }
}
