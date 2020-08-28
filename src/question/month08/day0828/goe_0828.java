import java.util.Scanner;

public class goe_0828 {

    public static void main(String[] args) {

        int[][] array = new int[4][2];

        int[] avgHorizontal = new int[4], avgVertical = new int[2];

        int[] sumHorizontal = new int[4], sumVertical = new int[2];

        int num, sum = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                num = sc.nextInt();

                array[i][j] = num;

                sumHorizontal[i] += array[i][j];

                sum += array[i][j];

                avgHorizontal[i] = sumHorizontal[i] / 2;
            }
        }

        for (int i = 0; i < array[i].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0) {
                    sumVertical[i] += array[j][0];
                    avgVertical[i] = sumVertical[i] / 4;
                } else {
                    sumVertical[i] += array[j][1];
                    avgVertical[i] = sumVertical[i] / 4;
                }
            }
        }
        sc.close();

        for (int i = 0; i < array.length; i++) {
            System.out.print(avgHorizontal[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array[3].length; i++) {
            System.out.print(avgVertical[i] + " ");
        }

        System.out.println();
        System.out.println(sum/8);
    }
}
