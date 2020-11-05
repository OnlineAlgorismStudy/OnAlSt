import java.util.Scanner;

public class goe_1105 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];

        for(int i = 0; i < str.length; i++){
            str[i] = sc.nextLine();
        }

        for(int i = str.length; i > 0; i--){
            System.out.println(str[i-1]);
        }

        sc.close();
    }
}
