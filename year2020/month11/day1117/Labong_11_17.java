import java.util.Scanner;

public class Labong_11_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		for(int i=arr.length; i>=0; i--){
			System.out.println(arr[i-1]);
		}

	}

}
