package OAS;

import java.util.Scanner;

public class goe_0720 {
    public static void main(String[] args) {

        int n;
        char[] ary = {69,88,73,84,45,33};
        String aryStr = String.valueOf(ary);

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        sc.close();

        char ascii = 65;

        if (n >= 3 && n <= 10) {
            for (char i = 0; i < n; i++) {
                for (char j = i; j < n; j++) {
                    System.out.print(ascii);
                    ascii++;
                }
                System.out.println();
            }
        }else {
            System.out.println("3 이상, 10 이하의 자연수를 입력하시오. ");
            System.out.print(aryStr);
        }
    }
}
