import java.util.Scanner;

public class goe_1027 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        //정규식을 이용해 숫자와 기호를 없앤다.
        str = str.replaceAll("[0-9]", "");
        str = str.replaceAll("[!-/]", "");

        //변환시킨 문자열을 넣을 문자 배열을 만든다.
        char[] ch = new char[100];

        for(int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
            //소문자인 것은 대문자로 변환시킨다.
            if(ch[i] >= 97 && ch[i] <= 122){
                ch[i] = (char)(ch[i] - 32);
            }
            //출력
            System.out.print(ch[i]);
        }

        sc.close();
    }
}
