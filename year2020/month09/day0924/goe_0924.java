import java.util.Scanner;

public class goe_0924 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4, num5;

        System.out.print(abs(num1 = sc.nextInt(), num2 = sc.nextInt(),
                num3 = sc.nextInt(), num4 = sc.nextInt(), num5 = sc.nextInt()));

        sc.close();
    }

    public static int abs(int num1, int num2, int num3, int num4, int num5){

        int sum = 0;

        int[] array = {num1, num2, num3, num4, num5};

        for(int i = 0; i < array.length; i++){
            sum +=  Math.abs(array[i]);
        }

        return sum;
    }
}
