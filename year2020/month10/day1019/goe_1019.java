import java.util.Scanner;

public class goe_1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        while (true) {
            System.out.print("ASCII code =? ");

            num = sc.nextInt();

            System.out.println((char)num);

            if(!(num >= 33 && num <= 127)){
                System.exit(0);
                sc.close();
            }
        }
    }
}
