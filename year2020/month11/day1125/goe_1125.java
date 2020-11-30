package month11;

import java.util.Scanner;

public class goe_1125 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String one = sc.next();
        String two = sc.next();

        one = one.replaceAll("[^0-9]", " ");
        two = two.replaceAll("[^0-9]", " ");

        one = one.substring(0, one.indexOf(" "));
        two = two.substring(0, two.indexOf(" "));

       System.out.println(Integer.parseInt(one)*Integer.parseInt(two));

        sc.close();
    }
}
