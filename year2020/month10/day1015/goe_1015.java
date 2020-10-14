import java.util.Scanner;

public class goe_1015 {
    static int mul = 1;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println(multiply(num1*num2*num3));

        sc.close();
    }

    public static int multiply(int num){

        int remain = num % 10;

        if(num < 10){
            return mul *= 1;
        } else {
            if(remain == 0){
                mul *= 1;
            }else {
                mul *= remain;
            }
            return multiply(num/10);
        }
    }
}
