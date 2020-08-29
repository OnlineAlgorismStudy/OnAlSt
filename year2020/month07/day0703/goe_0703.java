import java.util.Scanner;

public class goe_0703 {
    public static void main(String[] args) {

        int width, length;

        int widVal = 5;
        int lenVal = 2;

        Scanner sc = new Scanner(System.in);

        width = sc.nextInt();
        length = sc.nextInt();

        System.out.println("width = " + (width+widVal));
        System.out.println("length = " + length*lenVal);
        System.out.println("area = " + (width+widVal)*(length*lenVal));

        sc.close();
    }
}
