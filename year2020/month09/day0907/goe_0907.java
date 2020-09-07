import java.util.Scanner;

public class goe_0907 {
    public static void main(String[] args) {

        int n1, n2;

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println(square(n1,n2));

        sc.close();

    }

    public static int square (int n1, int n2){

        int squareVal  = (int)Math.pow(n1, n2);

        return squareVal;
    }
}
