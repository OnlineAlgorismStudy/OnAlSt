import java.util.Scanner;

public class goe_0826 {
    public static void main(String[] args) {

        int[][] school_class = new int[4][3];

        int[] sum = new int[4];

        int cnt;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < school_class.length; i++){
            System.out.print((i+1) + "class? ");
            for(int j = 0; j < school_class[i].length; j++){

                cnt = sc.nextInt();

                school_class[i][j] = cnt;

                sum[i] += school_class[i][j];
            }
        }

        sc.close();

        for(int i = 0; i < school_class.length; i++){
            System.out.println((i+1) + "class : " + sum[i]);
        }
    }
}
