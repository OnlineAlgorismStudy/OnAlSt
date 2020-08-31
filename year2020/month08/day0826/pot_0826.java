public static void main(String[] args) {
		//4반 3명의 점수 입력
		//한번에 입력,출력
		int[][] score = new int[4][3];
		Scanner sc = new Scanner(System.in);
		//합계 배열
		int[] ScoreResult = new int[4];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print((i+1) + "class? ");
				score[i][j] = sc.nextInt();
				ScoreResult[i] += score[i][j];
			}
		}
		System.out.println("");
		for (int i = 0; i < ScoreResult.length; i++) {
			System.out.println((i+1)+"class"+" : " + ScoreResult[i]);
		}
	}
