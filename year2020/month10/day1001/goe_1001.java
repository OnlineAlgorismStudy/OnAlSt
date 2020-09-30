import java.util.Scanner;

public class goe_1001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num <= 0 || num > 20) {
            System.out.println("20이하의 자연수를 입력하시오.");
            num = sc.nextInt();
        }

        print(num);

        sc.close();
    }

    public static void print(int num){
        if(num == 0){
            return;
        }else {
            System.out.println("recursive");
            print(num-1);
        }
    }
}
