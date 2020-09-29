#include <iostream>
#define MAX 7

using namespace std;

void rangeBubbleSort(int data[]);

int main() {
	int data[MAX];

	for (int i = 0; i < MAX; i++)
		scanf_s("%d", &data[i]);

	rangeBubbleSort(data);

	return 0;
}

void rangeBubbleSort(int data[]) {
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < MAX - 1; j++) {
			if (data[j] > data[j + 1]) {
				int temp = data[j];
				data[j] = data[j + 1];
				data[j + 1] = temp;
			}
		}
	}

	for (int i = 0; i < MAX; i++) {
		cout << data[i];

		if (i != MAX)
			cout << ' ';
	}
}