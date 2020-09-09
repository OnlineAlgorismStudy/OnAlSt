import java.util.Scanner;

public class goe_0909 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        gugu(n1,n2);
        sc.close();
    }

    public static void gugu(int n1, int n2) {

        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.println("== " + n1 + "dan" + " ==");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " =  " + i * j);
                }
                System.out.println();
                n1++;
            }
        } else {
            for (int i = n2; i <= n1; i++) {
                System.out.println("== " + n2 + "dan" + " ==");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " =  " + i * j);
                }
                System.out.println();
                n2++;
            }
        }
    }
}
