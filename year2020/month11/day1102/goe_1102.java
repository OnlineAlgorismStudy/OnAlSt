import java.util.Scanner;

public class goe_1102 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word1, word2;

        word1 = sc.next();
        word2 = sc.next();

        while (word1.length() > 100 || word2.length() > 100) {
            System.out.println(" 단어의 길이는 100자 이하로 입력하시오");
            word1 = sc.next();
            word2 = sc.next();
        }

        if(word1.length() < word2.length())
            System.out.println(word2.length());
        else
            System.out.println(word1.length());
        
        sc.close();
    }
}
