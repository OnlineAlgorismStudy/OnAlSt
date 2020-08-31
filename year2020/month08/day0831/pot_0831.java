public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] data = new String[3][5];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = sc.nextLine().toLowerCase().substring(0);
			}
		}
		for (String[] strings : data) {
			for (String x : strings) {
				System.out.print(x + " ");
			}
			System.out.println(" ");
		}
