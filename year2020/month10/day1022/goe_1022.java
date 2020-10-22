import java.util.Scanner;

public class goe_1022 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = sc.nextInt();

        while (num > 100 || num < 0) {
            System.out.println("문자열의 길이는 최대 100자 이하입니다.");
            num = sc.nextInt();
        }

        if (num > str.length()) {
            for (int i = str.length() - 1; i >= 0; i--)
                System.out.print(str.charAt(i));
        } else {
            for (int i = str.length() - 1; i >= num - 1; i--)
                System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
