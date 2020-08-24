import java.util.Scanner;

public class goe_0824 {
    public static void main(String[] args) {

        int[][] stu_score = new int[5][4];

        int score;

        int[] sum = new int [5];

        int cnt = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < stu_score.length; i++){
            for(int j = 0; j < stu_score[i].length; j++){
                score = sc.nextInt();

                stu_score[i][j] = score;

                sum[i] += stu_score[i][j];

            }
        }

        sc.close();

        for(int i = 0; i < sum.length; i++){
            if(320 <= sum[i]){
                System.out.println("pass");
                cnt++;
            }else{
                System.out.println("fail");
            }
        }

        System.out.println("Successful: " + cnt);

    }
}
