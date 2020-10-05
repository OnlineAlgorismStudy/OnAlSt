#include <iostream>

using namespace std;

int sequenceSum(int value, int by);

int main() {
	int n;

	cin >> n;

	if (0 < n && n <= 100)
		cout << sequenceSum(1, n);

	return 0;
}

int sequenceSum(int value, int by) {
	if (value == by)
		return by;
	else
		return value + sequenceSum(value + 1, by);
}