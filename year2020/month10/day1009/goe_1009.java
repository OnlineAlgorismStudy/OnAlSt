import java.util.Scanner;

public class goe_1009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num <= 0){
            System.out.println("자연수를 입력하시오.");
            num = sc.nextInt();
        }

        oddNeven(num);

        sc.close();
    }

    public static void oddNeven (int num) {

        if (num % 2 == 0) {
            if (num == 0) return;
            oddNeven(num - 2);
            System.out.print(num + " ");
        } else {
            if (num <= 0) return;
            oddNeven(num - 2);
            System.out.print(num + " ");
        }
    }
}
