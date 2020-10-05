import java.util.Scanner;

public class goe_1005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num <= 0 || num > 100) {
            System.out.println("100이하의 자연수를 입력하시오.");
            num = sc.nextInt();
        }

        System.out.println(sum(num));

        sc.close();
    }

    public static int sum(int num){

        if(num == 0){
            return 0;
        }else {
            return num + sum(num-1);
        }
    }
}
