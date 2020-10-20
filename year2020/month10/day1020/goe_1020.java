import java.util.Scanner;

public class goe_1020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(str.length() <= 100) {
            System.out.println(str + str);
        }else {
            System.out.println("문자열의 길이는 100이하로 입력하시오.");
        }

        sc.close();
    }
}
