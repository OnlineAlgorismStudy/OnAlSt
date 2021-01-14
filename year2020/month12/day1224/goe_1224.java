package month12;

public class goe_1224 {
    public static String solution(String phone_number) {
        String answer = "";

        //answer = phone_number.substring(0, phone_number.length()-4);

        answer = phone_number.substring(0, phone_number.length()-4).replaceAll("[0-9]","*") + phone_number.substring(phone_number.length()-4);

//        System.out.println(phone_number.substring(0, phone_number.length()-4).replaceAll("[0-9]","*"));
//        System.out.println(phone_number.substring(phone_number.length()-4));
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("01012345678");
    }
}
