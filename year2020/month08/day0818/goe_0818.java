package OAS;

import java.util.Scanner;

public class goe_0818 {
    public static void main(String[] args) {

        int num, score, temp = 0;
        int[] score_list;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        score_list = new int[num];

        for(int i = 0; i < score_list.length; i++){
            score = sc.nextInt();

            score_list[i] = score;
        }

        for(int i = 0; i < score_list.length; i++){
            for(int j = i+1; j < score_list.length; j++ ) {
              if(score_list[i] < score_list[j]){
                  temp = score_list[j];
                  score_list[j] = score_list[i];
                  score_list[i] = temp;
              }
            }
        }

        sc.close();

        for(int i = 0; i < score_list.length; i++)
        System.out.println(score_list[i]);
    }
}
