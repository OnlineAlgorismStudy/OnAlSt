package month11;

public class goe_1130 {
    public static String solution(int a, int b) {
        // 무적의 노가다
        String answer = "";

        switch (a) {
            case 1:
                if(b <= 31){
                if((a+b)% 7 == 2){
                    answer = "FRI";
                } else if ((a + b) % 7 == 3) {
                    answer = "SAT";
                } else if ((a + b) % 7 == 4) {
                    answer = "SUN";
                } else if ((a + b) % 7 == 5) {
                    answer = "MON";
                } else if ((a + b) % 7 == 6) {
                    answer = "TUE";
                } else if ((a + b) % 7 == 0) {
                    answer = "WED";
                } else {
                    answer = "THU";
                }}else {
                    break;
                }
                break;
            case 2:
                if(b <= 29){
                    if((a+b)% 7 == 0){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 1) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 2) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 3) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 4) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 5) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            case 3:
                if(b <= 31){
                    if((a+b)% 7 == 0){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 1) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 2) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 3) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 4) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 5) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            case 4:
                if(b <= 30){
                    if((a+b)% 7 == 5){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 6) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 0) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 1) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 2) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 3) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            case 5:
                if(b <= 31){
                    if((a+b)% 7 == 4){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 5) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 6) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 0) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 1) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 2) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            case 6:
                if(b <= 30){
                    if((a+b)% 7 == 2){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 3) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 4) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 5) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 6) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 0) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            case 7:
                if(b <= 31){
                    if((a+b)% 7 == 1){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 2) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 3) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 4) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 5) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 6) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            case 8:
                if(b <= 31){
                    if((a+b)% 7 == 6){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 0) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 1) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 2) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 3) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 4) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            case 9:
                if(b <= 30){
                    if((a+b)% 7 == 4){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 5) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 6) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 0) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 1) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 2) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            case 10:
                if(b <= 31){
                    if((a+b)% 7 == 3){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 4) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 5) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 6) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 0) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 1) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            case 11:
                if(b <= 30){
                    if((a+b)% 7 == 1){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 2) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 3) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 4) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 5) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 6) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            case 12:
                if(b <= 31){
                    if((a+b)% 7 == 0){
                        answer = "FRI";
                    } else if ((a + b) % 7 == 1) {
                        answer = "SAT";
                    } else if ((a + b) % 7 == 2) {
                        answer = "SUN";
                    } else if ((a + b) % 7 == 3) {
                        answer = "MON";
                    } else if ((a + b) % 7 == 4) {
                        answer = "TUE";
                    } else if ((a + b) % 7 == 5) {
                        answer = "WED";
                    } else {
                        answer = "THU";
                    }}else {
                    break;
                }
                break;
            default: answer = "Invalid month";
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        // 테스트용 메인 함수
        System.out.println(solution(13,29));
    }
}
