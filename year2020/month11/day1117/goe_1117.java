import java.util.Scanner;

public class goe_1117 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] array = str.split(" ");

        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }

        sc.close();
    }
}
