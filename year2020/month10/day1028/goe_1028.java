import java.util.Scanner;

public class goe_1028 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //nextLine은 next와 달리 한 라인을 전체를 입력받는다
        //next는 문자 또는 문자열을 공백을 기준으로 한 단어 또는 한 문자씩 입력 받는다
        String str = sc.nextLine();

        while (str.trim().length() > 100){
            System.out.println("공백을 포함한 100글자 이하의 문자열을 입력하시오");
            str = sc.nextLine();
        }

        //주어진 정규 표현식 또는 특정 문제를 기준으로 문자열울 나누고 배열에 저장하여 반환한다
        String[] words = str.split("\\s");

        System.out.println(words.length);

        sc.close();
    }
}
