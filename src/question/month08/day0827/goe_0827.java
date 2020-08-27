public class goe_0827 {
    public static void main(String[] args) {

        int[][] array = {{3, 5, 9},
                        {2, 11, 5},
                        {8, 30, 10},
                        {22, 5, 1}};

        int sum = 0;


        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){

                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
            System.out.println();
        }

        System.out.println(sum);

    }
}
