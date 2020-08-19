import java.util.Scanner;

public class goe_0819 {
    public static void main(String[] args) {


        char[] capital = new char[26];

        char ch;

        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < capital.length; i++) {
            ch = sc.next().charAt(0);

            if(!(ch >= 'A' && ch <= 'Z' )){
                break;
            } else {
                capital[ch - 'A']++;
            }
        }

        sc.close();

        for(int i = 0; i < capital.length; i++ ){
            if(capital[i] != 0)
            System.out.println( (char)(i+'A') + ": " + (int)capital[i]);
        }
    }
}
