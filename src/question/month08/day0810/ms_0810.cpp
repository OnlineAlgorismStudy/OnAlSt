#include <iostream>

using namespace std;

int main() {
	int data[10], sum = 0;
	double avg = 0.0;

	for (int i = 0; i < sizeof(data) / sizeof(data[0]); i++) {
		scanf_s("%d", &data[i]);
	}

	for (int i = 0; i < sizeof(data) / sizeof(data[0]); i++) {
		if (i % 2 == 0)
			avg += data[i];
		else
			sum += data[i];
	}

	cout << "sum : " << sum << endl;
	cout << "avg : " << (avg / 5) << endl;

	return 0;
}