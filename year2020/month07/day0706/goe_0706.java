import java.util.Scanner;

public class goe_0706 {
    public static void main(String[] args) {

        int year;

        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요 >> ");
        year = sc.nextInt();

        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
            System.out.println("leap year");
        } else {
            System.out.println("common year");
        }
    }
}
