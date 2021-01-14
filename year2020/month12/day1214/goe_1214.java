package month12;

public class goe_1214 {
    public static String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        int cnt = 0;

        for(int i = 0; i < str.length; i++) {
            if((" ").equals(str[i])){
                answer += str[i].toUpperCase();
                cnt = 0;
            } else {
                if (cnt % 2 == 0) {
                    answer += str[i].toUpperCase();
                    cnt++;
                } else {
                    answer += str[i].toUpperCase().toLowerCase();
                    cnt++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("try hello world");
        //Hello eVeryone
    }
}
