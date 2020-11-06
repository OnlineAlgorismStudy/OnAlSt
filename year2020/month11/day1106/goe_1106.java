import java.util.Scanner;

public class goe_1106 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        while (str.length() > 100){
            System.out.println("문장의 길이는 100자 이하로 입력하시오");
            str = sc.nextLine();
        }

        str = str.replaceAll("[^a-zA-Z]", " ");

        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++){
            if(i % 2 == 0)
            System.out.println(words[i]);
        }

        sc.close();
    }
}
