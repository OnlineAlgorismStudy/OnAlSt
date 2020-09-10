#include <iostream>

using namespace std;

void MultTable(int* range);

int main() {
	int data[2];

	for (int i = 0; i < 2; i++)
		scanf_s("%d", &data[i]);

	if (data[0] > data[1]) {
		int temp = data[0];
		data[0] = data[1];
		data[1] = temp;
	}

	MultTable(data);

	return 0;
}

void MultTable(int* range) {
	for (int i = *range; i <= *(range + 1); i++) {
		cout << "== " << i << "dan ==" << endl;

		for (int j = 1; j <= 9; j++)
			printf("%d * %d = %2d\n", i, j, i * j);

		cout << endl;
	}
}
