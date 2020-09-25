import java.util.Scanner;

public class goe_0925 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int exponent = sc.nextInt();

        while (exponent <= 1 || exponent >= 20) {
            System.out.println("1이상, 20이하의 정수를 입력하시오.");
            exponent = sc.nextInt();
        }

        exponent(exponent);

        sc.close();
    }

    public static void exponent(int exp){

        System.out.println((int)Math.pow(2, exp));
    }
}
