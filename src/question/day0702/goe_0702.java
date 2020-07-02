import java.util.Scanner;

public class goe_0702 {
    public static void main(String[] args) {

        final double ydTocm = 91.44;
        double yard;

        Scanner sc = new Scanner(System.in);
        System.out.print("yard? ");
        yard = sc.nextDouble();

        String ydTocmResult = String.format("%.1f", yard*ydTocm);

        System.out.println(yard + "yard = " + ydTocmResult + "cm");

    }
}
