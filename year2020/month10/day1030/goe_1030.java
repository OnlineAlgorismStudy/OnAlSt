import java.util.Scanner;

public class goe_1030 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //nextLine은 next와 달리 한 라인을 전체를 입력받는다
        //next는 문자 또는 문자열을 공백을 기준으로 한 단어 또는 한 문자씩 입력 받는다
        String str = sc.nextLine();

        //띄어쓰기를 포함하여 100글자 이하의 문자열을 입력 받고, 100글자가 넘어갈 시 다시 입력받게 함
        while (str.trim().length() > 100){
            System.out.println("100글자 이하의 문자열을 입력하시오");
            str = sc.nextLine();
        }

        //숫자와 영문 이외의 값은 제거하여 변수 str에 다시 넣어준다
        str = str.replaceAll("[^0-9a-zA-Z]", "");

        //특정문자를 기준으로 문자열을 잘라서 words 라는 이름에 배열에 넣는다
        String[] words = str.split("");

        for(int i = 0; i < str.length(); i++){
            //toLowerCase()함수를 사용해 입력 받은 인자 값을 소문자로 변환하여 리턴하고 이를 출력함
            System.out.print( words[i].toLowerCase());
        }

        sc.close();
    }
}
