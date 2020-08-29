import java.util.Scanner;

public class BR_0707 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 1번은 개, 2번은 고양이, 3번은 병아리로 정하고
		 * 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오.
		 * 해당 번호가 없으면 "I don't know."라고 출력한다.
		 * 
		 * 개-dog
		 * 
		 * 고양이-cat
		 * 
		 * 병아리-chick​ 
		 * 
		 * 입력 예.
		 * ===========================
		 * Number? 2
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * cat
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number? ");
	    int petNum = sc.nextInt();
	    sc.close();
	    
	    System.out.println(getPetStr(petNum));
	}
	
	private static String getPetStr(int petNum) {
		String petStr = "";
		
		switch (petNum) {
		case 1:
			petStr = "dog";
			break;
		case 2:
			petStr = "cat";
			break;
		case 3:
			petStr = "chick";
			break;
		default:
			petStr = "I don't know.";
			break;
		}
		
		return petStr;
	}

}
