package question.month08.day0827;

public class bangJjo_0827 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] arr = {
                {3, 5, 9},
                {2, 11, 5},
                {8, 30, 10},
                {22, 5, 1}
            };
		
        int sum = 0;
        		
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr[i].length; j++) {
        		System.out.print(arr[i][j]+" ");
        	} // end for
        	System.out.println();
        } // end for
        
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr[i].length; j++) {
        		sum += arr[i][j];
        	} // end for
        } // end for
		
        System.out.println(sum);
        
	} // main

} // class
