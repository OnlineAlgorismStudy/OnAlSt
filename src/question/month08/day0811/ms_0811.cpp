#include <iostream>

using namespace std;

int main() {
	int data[10];

	for (int i = 0; i < sizeof(data) / sizeof(data[0]); i++) {
		scanf_s("%d", &data[i]);
	}

	for (int i = 0; i < sizeof(data) / sizeof(data[0]) - 1; i++) {
		int half = i;

		for (int j = i + 1; j < sizeof(data) / sizeof(data[0]); j++) {
			if (data[half] < data[j])
				half = j;

			int temp = data[i];
			data[i] = data[half];
			data[half] = temp;
		}
	}

	for (int i = 0; i < sizeof(data) / sizeof(data[0]); i++) {
		cout << data[i] << " ";
	}

	return 0;
}