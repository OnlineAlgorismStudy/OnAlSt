import java.util.Scanner;

public class goe_1014 {
    static int sum = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num <= 0 || num > 1000000){
            System.out.println("100만 이하의 자연수를 입력하시오.");
            num = sc.nextInt();
        }

        System.out.println(div(num));

        sc.close();
    }

    public static int div(int num){

        int level = 0;
        int result;

        if(num == 1){
            return sum;
        }else if(num % 2 == 0){
            div(num/2);
            level++;
            return sum +=level;
        } else {
            div(num/3);
            level++;
            return sum +=level;
        }
    }
}
