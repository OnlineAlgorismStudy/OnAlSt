public static void main(String[] args) {
		// 4 행 3열 값 출력
		// 2차원 배열의 합 출력
		int[][] arr1 = { { 3, 5, 9 }, { 2, 11, 5 }, { 8, 30, 10 }, { 22, 5, 1 } };
		int result = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
				result += arr1[i][j];
			}
			System.out.println("");
		}
		
		System.out.print(result);
	}
