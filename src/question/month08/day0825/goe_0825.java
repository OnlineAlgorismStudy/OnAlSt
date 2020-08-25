import java.util.Scanner;

public class goe_0825 {
    public static void main(String[] args) {

        int[] stu_score = new int[100];

        int[] score_rating = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        int[] score_cnt = new int[10];

        int score;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < stu_score.length; i++) {

            score = sc.nextInt();

            if ( score == 0){
                break;
            }

            stu_score[i] = score;
        }

        sc.close();

        for(int i = 0; i < stu_score.length; i++) {
          for(int j = 0; j < score_rating.length; j++){
             if(((stu_score[i]/10)*10) == score_rating[j]){
                 score_cnt[j]++;
             }
          }
        }

        for(int i = 0; i < score_rating.length; i++)
            if(score_cnt[i] != 0)
        System.out.println(((score_rating[i]/10)*10)+ ": " + score_cnt[i] + " person");
    }
}
