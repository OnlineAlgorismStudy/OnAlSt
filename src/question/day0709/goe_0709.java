import java.util.Scanner;

public class goe_0709 {
    public static void main(String[] args) {

        String key;

        int base, height;
        double tri_width;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Base = ");
            base = sc.nextInt();

            System.out.print("Height = ");
            height = sc.nextInt();

            tri_width = (double)((base*height)/2);
            System.out.print("Triangle width = " + tri_width +"\n");

            System.out.print("Continue? ");
            key = sc.next();

            if(!("Y".equals(key) || "y".equals(key))) {
                break;
            }
        }

        sc.close();
    }
}
