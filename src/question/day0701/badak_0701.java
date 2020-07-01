package homework;

public class badak_0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double yd = 2.1;
		double in = 10.5;

		System.out.printf("%5.1fyd = %5.1fcm\n", yd, changeCm(0,yd));
		System.out.printf("%5.1fin = %5.1fcm\n", in, changeCm(1,in));
	}
	
	public static double changeCm(int type, double data) {
		//@EXP type 0 => yard , type 1 => inch
		double result;
		if(type==0) {
			result = data * 91.44;
		}else {
			result = data * 2.54;
		}
		return result;
	}

}
