import java.util.Arrays;
import java.util.Scanner;

public class goe_1112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] str = new String[3];

        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
            while (str[i].length() > 10 || str[i].length() < 1){
                System.out.println("단어의 길이는 1이상 10 이하로 입력하시오");
                str[i] = sc.next();
            }
        }

        Arrays.sort(str);
        System.out.println(str[0]);

        sc.close();
    }
}
