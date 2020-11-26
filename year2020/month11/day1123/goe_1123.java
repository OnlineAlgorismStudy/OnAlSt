package month11;

import java.util.Scanner;

public class goe_1123 {
    public static void main(String[] args) {

        String[] array = new String[5];
        String str = "";

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            array[i] = sc.next();

            while (array[i].length() > 100) {
                System.out.println("단어는 100자 이하로 입력하시오");
                array[i] = sc.next();
            }
        }

        String one = sc.next();
        String two = sc.next();

        for(int i = 0; i < array.length; i++) {
            if (array[i].contains(one) || array[i].contains(two))
                str += array[i] + '\n';
            }

        if("".equals(str)){
            System.out.println("none");
        }else {
            System.out.println(str);
        }

        sc.close();
    }
}
