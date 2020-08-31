import java.util.Scanner;

public class goe_0831 {
    public static void main(String[] args) {

        char[][] array = new char[3][5];

        char alphabet;

        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                alphabet = sc.next().charAt(0);

                array[i][j] = (char)(alphabet+32);

            }
        }

        sc.close();

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
