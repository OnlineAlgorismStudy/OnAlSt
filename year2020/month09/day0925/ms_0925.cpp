#include <iostream>

using namespace std;

int recursionPow(int n);

int main() {
	int n;

	cin >> n;

	if (1 <= n && n <= 20)
		cout << recursionPow(n) << endl;

	return 0;
}

int recursionPow(int n) {
	if (n == 0)
		return 1;
	else
		return 2 * recursionPow(n - 1);
}