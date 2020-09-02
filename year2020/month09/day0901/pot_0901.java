public class test {
//출력메서드
	public void print1(int a) {
  //출력용 문자열 저장
		String data = "~!@#$^&()_+|";
    //입력받은 수만큼 for문 반복
		for (int i = 0; i < a; i++) {
			System.out.println(data);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    //메서드 사용을 위한 객체 생성
		test printMet = new test();
		System.out.print("입력 : ");
    //입력 및 print1 메서드 호출
		int input = sc.nextInt();
		printMet.print1(input);
	}
}
