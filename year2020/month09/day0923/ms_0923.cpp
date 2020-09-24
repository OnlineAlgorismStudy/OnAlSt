#include <iostream>
#include <cmath>

using namespace std;

int getCount(double data[]);

int main() {
	// data[0] < data[1]
	double data[2] = { 0, 0 };

	cin >> data[0] >> data[1];

	if (data[0] > 0 && data[1] > 0) {
		if (data[0] > data[1]) {
			double temp = data[0];
			data[0] = data[1];
			data[1] = temp;
		}

		cout << getCount(data) << endl;
	}

	return 0;
}

int getCount(double data[]) {
	double x = sqrt(data[0]);
	double y = sqrt(data[1]);
	int count = 0;

	if (x == int(x))
		count = 1;

	for (int i = x + 1; i <= y; i++)
		count++;

	return count;
}