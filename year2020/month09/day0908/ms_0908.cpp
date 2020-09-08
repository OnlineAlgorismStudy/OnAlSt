#include <iostream>

using namespace std;

void changeValue(int* pointer);

int main() {
	// data[0] 이 작은 수, data[1] 이 큰 수를 가진다.
	int data[2];

	for (int i = 0; i < 2; i++)
		scanf_s("%d", &data[i]);

	if (data[0] > data[1]) {
		int temp = data[0];
		data[0] = data[1];
		data[1] = temp;
	}

	changeValue(data);
	cout << data[0] << ' ' << data[1] << endl;

	return 0;
}

void changeValue(int* pointer) {
	*pointer *= 2;
	*(++pointer) /= 2;
}
