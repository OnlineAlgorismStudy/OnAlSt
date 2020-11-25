import java.util.Scanner;


public class Labong_11_16 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];	
		StringBuffer total = new StringBuffer();
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i2=0; i2<5; i2++){
			total.append(arr[i2]);
		}
		
		for(int k=0; k<total.length(); k++){
			System.out.print(total.substring(k,k+1));
			if((k+1)%3==0){
				System.out.print(" ");
			}
		}
		
		sc.close();
	}

}
