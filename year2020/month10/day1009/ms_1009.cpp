#include <iostream>

using namespace std;

void OddEven(int n);

int main() {
	int n;

	cin >> n;

	if (0 < n)
		OddEven(n);

	return 0;
}

void OddEven(int n) {
	if (n <= 0)
		return;

	OddEven(n - 2);
	cout << n << ' ';
}