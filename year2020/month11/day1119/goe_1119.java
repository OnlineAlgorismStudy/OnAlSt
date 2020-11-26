package month11;

import java.util.Scanner;

public class goe_1119 {
    public static void main(String[] args) {

        String[] array = new String[50];
        int cnt = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
                array[i] = sc.next();

                if(array[i].equals("0")){
                    break;
                }

                while (array[i].length() > 100) {
                    System.out.println("단어의 길이는 100자 이하로 입력하시오");
                    array[i] = sc.next();
                }

                cnt++;
        }

        System.out.println(cnt);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && !(array[i] == null))
                System.out.println(array[i]);
        }

        sc.close();
    }
}
