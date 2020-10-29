import java.util.Scanner;

public class goe_1029 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] words = str.split("");

        int num = str.length()-1;
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = num - i; j < str.length(); j++) {
                System.out.print(words[j]);
            }
            cnt++;

            for (int j = 0; j < str.length()-cnt; j++) {
                System.out.print(words[j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
