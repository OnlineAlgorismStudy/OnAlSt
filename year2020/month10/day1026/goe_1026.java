import java.util.Scanner;

public class goe_1026 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch;

        while (true){
            //문자를 입력 받는다.
            ch = sc.next().charAt(0);

            if(ch >= 48 && ch <= 57){
                System.out.println((int)ch);

            } else if (ch >= 'A' && ch <= 'Z'){
                System.out.println(ch);

            } else if (ch >= 'a' && ch <= 'z'){
                System.out.println(ch);

            }else {
                break;
            }
        }
        sc.close();
    }
}
