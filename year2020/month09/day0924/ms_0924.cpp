#include <iostream>

using namespace std;

void sumOfAbs(int* p);

int main() {
	int data[5];

	for (int i = 0; i < 5; i++)
		scanf_s("%d", &data[i]);

	sumOfAbs(data);

	return 0;
}

void sumOfAbs(int* p) {
	int sum = 0;

	for (int i = 0; i < 5; i++, p++)
		sum += abs(*p);

	cout << sum << endl;
}
