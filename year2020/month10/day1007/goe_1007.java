import java.util.Scanner;

public class goe_1007 {
    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num < 1|| num > 100000000) {
            System.out.println("9자리 이하의 자연수를 입력하시오.");
            num = sc.nextInt();
        }

        System.out.println(Squared(num));

        sc.close();
    }

    public static int Squared(int num){

        int rem;

        if(num == 1){
            return sum += num * num;
        }else {
            rem = num%10;
            sum += rem * rem;
            return Squared(num/10);
        }
    }
}
