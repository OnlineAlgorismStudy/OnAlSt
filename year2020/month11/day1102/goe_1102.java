import java.util.Scanner;

public class goe_1102 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        if(word1.length() < word2.length())
            System.out.println(word2.length());
        else
            System.out.println(word1.length());
        
        sc.close();
    }
}
