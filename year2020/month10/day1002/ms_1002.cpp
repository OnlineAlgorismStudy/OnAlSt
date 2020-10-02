#include <iostream>

using namespace std;

void recursionPrint(int n);

int main() {
	int n;

	cin >> n;

	if (0 < n && n <= 50)
		recursionPrint(n);

	return 0;
}

void recursionPrint(int n) {
	if (n == 0)
		return;

	cout << n << ' ';
	recursionPrint(n - 1);
}