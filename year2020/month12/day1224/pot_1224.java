class Solution {
    public String solution(String phone_number) {
		String answer = "";
        //뒷 4자리를 제외한 수의 길이만큼 *로 채워주기
        //뒷 4자리 수를 제외한 길이만큼 반복
		for (int i = 0; i < phone_number.length()-4; i++) {
			answer += "*";
		}
        //*로 채운 문자열에 phone_number 뒷4자리 더해주기
		return answer+phone_number.substring(phone_number.length()-4,phone_number.length());
	}
}
