import java.util.Scanner;

public class goe_0904 {
    public static void main(String[] args) {

        int i1, i2, i3;

        Scanner sc = new Scanner(System.in);

        i1 = sc.nextInt();
        i2 = sc.nextInt();
        i3 = sc.nextInt();

        System.out.println(max(i1, i2, i3));

        sc.close();
    }

    public static int max(int i1, int i2, int i3){

        int maxVal = (i1 > i2) ? i1 : i2;

        maxVal = (maxVal > i3) ? maxVal : i3;

        return maxVal;
    }
}
