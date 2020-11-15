import java.util.Scanner;

public class goe_1109 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        while (str.length() > 20){
            System.out.println("20자 이하로 입력하시오");
            str = sc.nextLine();
        }

        System.out.println(str + "fighting");

        sc.close();
    }
}
