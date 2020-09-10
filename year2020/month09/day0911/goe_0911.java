import java.util.Scanner;

public class goe_0911 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

          while (num > 1000){
              System.out.println("1000이하의 자연수를 입력하시오. ");
              num = sc.nextInt();
          }

        sum(num);

        sc.close();
    }

    public static void sum (int num){

        int one = 1;
        int sum = 0;

        while (one <= num) {
            sum += one;
            one++;
        }
        System.out.println(sum);
    }
}
