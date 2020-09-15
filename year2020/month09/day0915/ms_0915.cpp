#include <iostream>

using namespace std;

int Square(int x, int y);

int main() {
	int data[2] = { 0, 0 };

	for (int i = 0; i < 2; i++) {
		int temp;

		scanf_s("%d", &temp);

		if (temp >= 0)
			data[i] = temp;
	}

	cout << Square(data[0], data[1]) << endl;

	return 0;
}

int Square(int x, int y) {
	if (x > y)
		return x * x - y * y;
	else
		return y * y - x * x;
}