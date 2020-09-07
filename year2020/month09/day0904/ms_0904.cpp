#include <iostream>

using namespace std;

int getMax(int *p);

int main() {
	int data[3];

	for (int i = 0; i < 3; i++)
		scanf_s("%d", &data[i]);

	cout << getMax(data) << endl;

	return 0;
}

int getMax(int *p) {
	int max = *p;

	p++;
	for (int i = 1; i < 3; i++, p++)
		if (max < *p)
			max = *p;

	return max;
}