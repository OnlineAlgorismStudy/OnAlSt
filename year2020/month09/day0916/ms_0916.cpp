#include <iostream>

using namespace std;

void TSS(int data[4][4]); // Total Score by Student

int main() {
	int data[4][4] = {
		{ 0, 0, 0, 0 },
		{ 0, 0, 0, 0 },
		{ 0, 0, 0, 0 },
		{ 0, 0, 0, 0 }
	};

	TSS(data);

	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			cout << data[i][j];

			if (j != 4)
				cout << ' ';
		}

		cout << endl;
	}

	return 0;
}

void TSS(int data[4][4]) {
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			int temp;

			scanf_s("%d", &temp);

			if (0 <= temp && temp <= 100) {
				data[i][j] = temp;
				data[i][3] += data[i][j];
				data[3][j] += data[i][j];
			}
		}

		data[3][3] += data[i][3];
	}
}