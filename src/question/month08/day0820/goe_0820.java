public class goe_0820 {
    public static void main(String[] args) {

        int[][] array2D = {
                {5, 8, 10, 6, 4},
                {11, 20, 1, 13, 2},
                {7, 9, 14, 22, 3}};

        for(int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                System.out.printf("%2d   ", array2D[i][j]);
            }
            System.out.println();
        }
    }
}
