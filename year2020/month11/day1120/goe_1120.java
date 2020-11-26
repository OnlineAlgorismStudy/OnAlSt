package month11;

import java.util.Arrays;
import java.util.Scanner;

public class goe_1120 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] str = new String[num];

        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();

            while (str[i].length() > 100){
                System.out.println("문자열의 길이는 100자 이하로 입력하시오");
                str[i] = sc.next();
            }
        }

        for(int i = 0; i < str.length; i++){
            //사전순(아스키코드순)으로 정렬
            Arrays.sort(str);
            System.out.println(str[i]);
        }

        sc.close();
    }
}
