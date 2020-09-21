#include <iostream>

using namespace std;

void bubbleSort(int data[], int size);

int main() {
	int data[10] = { 0, };

	for (int i = 0; i < 10; i++)
		scanf_s("%d", &data[i]);
	
	bubbleSort(data, sizeof(data) / sizeof(data[0]));

	return 0;
}

void bubbleSort(int data[], int size) {
	for (int i = 0; i < size - 1; i++) {
		for (int j = 0; j < size - 1; j++) {
			if (data[j] < data[j + 1]) {
				int temp = data[j];
				data[j] = data[j + 1];
				data[j + 1] = temp;
			}
		}

		for (int j = 0; j < size; j++) {
			cout << data[j];

			if (j != size)
				cout << ' ';
		}

		cout << endl;
	}
}