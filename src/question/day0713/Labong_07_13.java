import java.util.ArrayList;
import java.util.List;

public class Labong_07_13 {

	public static void main(String[] args) {
			
		List<String> list = new ArrayList<String>();
				
		for(int i =2; i <= 4; i++) {
			for(int k=1; k <=5; k++) {
				list.add(String.format("%d * %d = %3d",i,k,i*k));
				list.add("   ");
			}
			
		} // for end
		
		int count = 1;
		for(int y = 0; y < list.size(); y++) {
			System.out.print(list.get(y));
			if(count == 10) {
				System.out.println("");
				count = 1;
			}else {
				count ++;
			}
		} // for end
		
	} // main end

}
