import java.util.Scanner;

public class goe_0901 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        print(num);

        sc.close();
    }

    public static void print(int n){
        for(int i = 0; i < n; i++)
        System.out.println("~!@#$^&*()_+|");
    }
}
