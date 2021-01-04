package month11;

import java.util.*;

public class goe_1127 {
    public static int[] solution(int[] numbers) {
        // Set 인터페이스는 중복된 요소를 저장하지 않는다
        // HashSet은 Set 인터페이스를 구현한 가장 대표적인 컬렉션
        Set set = new HashSet();

        // add를 통해 중복되지 않은 새로운 요소를 저장
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }

        // 정수 배열의 크기를 set의 크기만큼 저장함
        int[] answer = new int[set.size()];

        // 정수 배열에 toArray를 통해 저장된 객체들을 객체배열의 형태로 반환해 저장
        for(int i = 0; i < answer.length; i++){
            answer[i] = (int)set.toArray()[i];
        }

        // set의 요소들을 불러와 정수 배열에 저장하기 위해 List로 변환 - 컬렉션 set이 갖는 ArrayList 생성
        // List 인터페이스를 구현하는 ArrayList는 저장순서가 유지되고 중복을 허용한다. 또 저장 용량을 초과한다면 자동으로 부족한 크기만큼 저장 용량이 늘어남
        /* 참조변수의 타입을 ArrayList가 아닌 List타입으로 한 이유는, 만일  List 인터페이스를 구현한
         다른 클래스로 바꿔야한다면 선언문 하나만 바꾸면 나머지 코드는 검토하지 않아도 되기 때문이다 */
        List list = new ArrayList(set);

        // get 메소드를 통해 리스트에 있는 요소들을 불러와 정수 배열에 저장
        for(int i = 0; i < list.size(); i++){
            answer[i] = (int) list.get(i);
        }

        // 정수 배열을 오름차순으로 정렬
        Arrays.sort(answer);

        return answer;
    }
}


