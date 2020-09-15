import java.util.Scanner;

public class goe_0915 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println(squareSub(num1 = sc.nextInt(), num2 = sc.nextInt()));

        sc.close();
    }

    public static int squareSub(int num1, int num2){

        int sub = 0;

        int max = 0, min = 0;

        if(num1 > num2){
            max = num1;
            min = num2;
        }else {
            max = num2;
            min = num1;
        }

        sub = max*max - min*min;

        return sub;
    }
}
