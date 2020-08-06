#include <iostream>

using namespace std;

int main() {
	int data[10], min = 1000, i = 0;

	while (i < 10) {
		scanf_s("%d", &data[i]);

		if (data[i] > 1000)
			continue;

		i++;
	}

	for (int i = 0; i < 10; i++) {
		if (data[i] < min)
			min = data[i];
	}

	cout << min << endl;

	return 0;
}