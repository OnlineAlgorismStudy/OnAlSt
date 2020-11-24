package month11;

import java.util.Scanner;

public class goe_1113 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        while (str.length() > 20){
            System.out.println("문자열의 길이는 20 이하로 입력하시오");
            str = sc.nextLine();
        }

        // str1에는 숫자가 아닌 것은 빈칸으로 바꾼다
        String str1 = str.replaceAll("[^0-9]", " ");
        // str1에는 숫자와 .이 아닌 것은 빈칸으로 바꾼다
        String str2 = str.replaceAll("[^0-9..]", " ");
        // words, words2 모두 빈칸을 기준으로 문자열을 잘라서 저장
        String[] words = str1.split(" ");
        String[] words2 = str2.split(" ");

        System.out.println(Integer.parseInt(words[0]) * 2);
        // 소수점 두번째 자리까지 출력
        System.out.println(String.format("%.2f", words2[0]));

        sc.close();
    }
}
