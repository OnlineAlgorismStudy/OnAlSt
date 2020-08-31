public static void main(String[] args) {
		// 가로평균, 세로평균, 전체평균 출력
		int[][] arr1 = new int[4][2]; // 배열입력
		int[] width = new int[4];
		int[] height = new int[2];
		int result = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
				width[i] += arr1[i][j];
				result += arr1[i][j];
     // 0 0 / 1 0 / 2 0/ 3 0
		// 0 1 / 1 1 / 2 1 / 3 1
				if (j == 0) {
					height[0] += arr1[i][j];
				} else
					height[1] += arr1[i][j];
			}
		}


		for (int j = 0; j < width.length; j++) {
			System.out.print((width[j] /2)  + " ");
		}
		System.out.println("");
		System.out.print(height[0] / arr1.length + " ");
		System.out.println(height[1] / arr1.length);
		System.out.println(result);
	}
