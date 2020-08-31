public static void main(String[] args) {
		// 학생수 100명
		int[] data = new int[100];
		// 100 ~ 10 점 단위 count 배열
		int[] data1 = new int[10];
		//점수입력
		int data2 = 0;
		Scanner sc = new Scanner(System.in);

		// 100번 이하 입력 , 0 입력 시 break;
		for (int i = 0; i < data.length; i++) {
			data2 = sc.nextInt();
			if (data2 == 0) {
				break;
			}
			for (int j = 0; j < data1.length; j++) {
				if (j  == (data2 / 10)-1) {
					data1[j]++;
				}

			}
		}

		for (int i = 9; i >= 0; i--) {
			if (data1[i] == 0) {
				continue;
			} else {
				System.out.println((i * 10)+10 + " : " + data1[i]);
			}
		}

	}
