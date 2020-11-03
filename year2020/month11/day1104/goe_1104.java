import java.util.Scanner;

public class goe_1104 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //nextLine은 next와 달리 한 라인을 전체를 입력받는다
        String str = sc.nextLine();

        while (str.length() > 100){
            System.out.println("문자열의 길이는 100자 이하로 입력하시오");
            str = sc.nextLine();
        }

        //특정문자를 기준으로 문자열을 잘라서 words 라는 이름에 배열에 넣는다
        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++){
            System.out.println(i+1 + ". " + words[i]);
        }

        sc.close();
    }
}
