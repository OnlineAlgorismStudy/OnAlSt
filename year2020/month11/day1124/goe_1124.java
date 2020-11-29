package month11;

import java.util.Scanner;

public class goe_1124 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String one = sc.next();
        String two = sc.next();

        while (one.length() > 100) {
            System.out.println("100자 이하로 입력하시오");
            one = sc.next();
        }

        while (two.length() > 100) {
            System.out.println("100자 이하로 입력하시오");
            two = sc.next();
        }

        int num = sc.nextInt();

        while (num < 1) {
            System.out.println("1보다 같거나 크게 입력하시오");
            num = sc.nextInt();
        }

        System.out.println(one + two);
        System.out.println(one.substring(0, num) + two.substring(num));

        sc.close();
    }
}
