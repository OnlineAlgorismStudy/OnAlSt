public class test {
	//2차원 배열 생성 int[][] 변수 = {{},{},{}}
	public static void main(String[] args) {
		int[][] data = {{5,8,10,6,4},{11,20,1,13,2},{7,9,14,22,3}};
		
		
		//행의 수 만큼 반복 - 3
		for (int i = 0; i < data.length; i++) {
			//열의 수 만큼 반복 -5
			for (int j = 0; j < data[i].length; j++) {
				System.out.printf("%2d  ",data[i][j]);
			}
			System.out.println("");
		}
	}	

}
