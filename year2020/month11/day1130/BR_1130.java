class Solution {
    public String solution(int a, int b) {
		/* **************************************************
		 * 문제.
		 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
		 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
		 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.
		 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
		 * 
		 * 2016년은 윤년입니다.
		 * 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 5 24
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * TUE
		 * ===========================
		 * **************************************************/
    	String answer = "";
    	
    	switch (getDay(a, b)) {
    	case 0:
    		answer = "FRI";
    		break;
    	case 1:
    		answer = "SAT";
    		break;
    	case 2:
    		answer = "SUN";
    		break;
    	case 3:
    		answer = "MON";
    		break;
    	case 4:
    		answer = "TUE";
    		break;
    	case 5:
    		answer = "WED";
    		break;
    	case 6:
    		answer = "THU";
    		break;
    	}
    	
    	return answer;
    }
    
    private int getDay (int month, int date) {
    	int days = 0;
    	while (month > 1) {
    		month--;
    		if (month == 2) {
    			days += 29;
    		} else if (month <= 7 && month % 2 == 1) {
    			days += 31;
    		} else if (month >= 8 && month % 2 == 0) {
    			days += 31;
    		} else {
    			days += 30;
    		}
    	}
    	days += date - 1;
    	return days%7;
    }
}
