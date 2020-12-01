package month11;

import java.util.Scanner;

public class goe_1126 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //바름님 코드 참고
        String num = Integer.toString(sc.nextInt());
        String db = String.format("%.3f", sc.nextDouble());
        String str = sc.next();

        while (num.length() > 30) {
            System.out.println("문자열의 길이는 30자 이하로 입력하시오");
            num = Integer.toString(sc.nextInt());
        }

        while (db.length() > 30) {
            System.out.println("문자열의 길이는 30자 이하로 입력하시오");
            db = String.format("%.3f", sc.nextDouble());
        }

        while (str.length() > 30) {
            System.out.println("문자열의 길이는 30자 이하로 입력하시오");
            str = sc.next();
        }


        String string = num + db + str;

        int length;
        if((string.length()/2) % 2 == 1){
            length = (string.length()/2) +1;
        }else {
            length = string.length()/2;
        }

        System.out.println(string.substring(0,length));
        System.out.println(string.substring(length));
    }
}
