import java.util.Scanner;

public class goe_1008 {
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        div(num);

        sc.close();
    }

    public static void div(int num){

        if(num < 1){
            return;
        }else {
            result = num/2;
            div(result);
            System.out.print(num + " ");
        }
    }
}
