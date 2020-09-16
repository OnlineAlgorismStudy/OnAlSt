import java.util.Scanner;

public class goe_0916 {
    public static void main(String[] args) {

        int[][] array= new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                int num =  sc.nextInt();
                array[i][j] = num;
            }
        }

        print(array);

        sc.close();
    }

    public static void print(int[][] score){

        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        int sum = 0;

        for(int i = 0; i < score.length; i++){
            for(int j = 0; j < score[i].length; j++){
                colSum[i] += score[j][i];
                rowSum[i] += score[i][j];
            }
            sum += rowSum[i];
        }

        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.print(rowSum[i] + " ");
            System.out.println();
        }

        for(int i = 0; i < colSum.length; i++){
            System.out.print(colSum[i]+ " " );
        }
        System.out.print(sum);
    }
}
