package study;

public class study0910 {
	public void change(char a) {
		//@ * 10번 저장할 변수 생성
		String result = "";
		for (int i = 0; i < 10; i++) {
			//1~10번 삽입
			result += a;
		}
		//출력!
		System.out.println(result);
	}

	public static void main(String[] args) {
		//@ * 10번 출력  3번> @ 출력한 횟수(3번출력)
		study0910 st = new study0910();
		//파라미터는 '@' 분자
		char a = '@';
		//순서 설정 > 배열에
		String[] b = {"first","second","third"};
		for (int i = 0; i < 3; i++) {
			//해당번째 출력해주고 @ 10번찍기
			System.out.println(b[i]);
			st.change(a);
		}
		
	}

}
