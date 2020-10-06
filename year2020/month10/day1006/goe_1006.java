import java.util.Scanner;

public class goe_1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num < 1 || num > 50) {
            System.out.println("50이하의 자연수를 입력하시오.");
            num = sc.nextInt();
        }

        System.out.println(print(num));

        sc.close();
    }

    public static int print(int num){

        if(num == 1){
            return 1;
        }else {
            return print(num-1) + print(num/2);
        }
    }
}
