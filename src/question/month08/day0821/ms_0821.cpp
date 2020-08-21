#include <iostream>

using namespace std;

void Input(int data[2][4]) {
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 4; j++) {
			scanf_s("%d", &data[i][j]);
		}
	}
}

int main() {
	int first[2][4], second[2][4];

	cout << "first array" << endl;
	Input(first);
	
	cout << "second array" << endl;
	Input(second);

	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 4; j++) {
			cout << first[i][j] * second[i][j];

			if (j != 4)
				cout << ' ';
		}

		cout << endl;
	}

	return 0;
}