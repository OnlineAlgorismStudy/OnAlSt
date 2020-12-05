class Solution {
    public String solution(int a, int b) {
        // 1 ~ 12월 까지 표현 0번째 인덱스는 0으로 초기화
		int[] month = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 요일, 1월1일이 금요일이니까
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int date = 0;
		for (int i = 0; i < a; i++) {
			date += month[i];
		}
		date += b-1;
		return day[date % 7];
		
    }
}
