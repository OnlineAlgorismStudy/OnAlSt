#include <iostream>

using namespace std;

void AVC(int* X, double* Y); // Absolute Value Calculation

int main() {
	int iData[2]; // int type data
	double dData[2]; // double type data

	for (int i = 0; i < 2; i++)
		scanf_s("%d", &iData[i]);

	for (int i = 0; i < 2; i++)
		scanf_s("%lf", &dData[i]);

	AVC(iData, dData);

	return 0;
}

void AVC(int* X, double* Y) {
	if (abs(*(X + 0)) > abs(*(X + 1)))
		cout << *X;
	else
		cout << *(++X);

	cout << endl;

	if (abs(*(Y + 0)) > abs(*(Y + 1)))
		cout << *(++Y);
	else
		cout << *Y;
}