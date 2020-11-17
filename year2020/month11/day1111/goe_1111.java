import java.util.Scanner;

public class goe_1111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(str.contains("c")){
            System.out.print("Yes ");
        }else {
            System.out.print("No ");
        }

        if(str.contains("ab")){
            System.out.print("Yes ");
        }else {
            System.out.print("No ");
        }

        sc.close();
    }
}
