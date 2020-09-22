import java.util.Scanner;

public class goe_0922 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        SquaredNCube(num1 = sc.nextInt(), num2 = sc.nextInt());

        sc.close();
    }

    public static final void SquaredNCube(int x, int y){

        int sub = x - y;
        int sum = x + y;

        Math.pow(sub, 2);
        Math.pow(sum, 3);

        System.out.println("(" + x + " - " + y + ")" + " ^ " + 2 +  " = " + (int)Math.pow(sub, 2));
        System.out.println("(" + x + " + " + y + ")" + " ^ " + 3 +  " = " + (int)Math.pow(sum, 3));
    }

}
