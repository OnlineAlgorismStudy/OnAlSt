#include <iostream>

using namespace std;

int recursion(int n);

int main() {
	int n;

	cin >> n;

	if (0 < n && n <= 100)
		cout << recursion(n) << endl;

	return 0;
}

int recursion(int n) {
	if (n == 1)
		return 1;
	else if (n == 2)
		return 2;
	else
		return (recursion(n - 2) * recursion(n - 1)) % 100;
}