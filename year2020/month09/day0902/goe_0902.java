import java.util.Scanner;

public class goe_0902 {
    public static void main(String[] args) {

        int radius;

        Scanner sc = new Scanner(System.in);

        radius = sc.nextInt();

        print(radius);

        sc.close();
    }

    public static void print(int r){
        System.out.println(String.format("%.2f", 3.14 * r * r));
    }
}
