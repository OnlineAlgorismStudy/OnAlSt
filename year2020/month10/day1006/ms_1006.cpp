#include <iostream>

using namespace std;

int Sequence(int n);

int main() {
	int n;

	cin >> n;

	if (0 < n && n <= 50)
		cout << Sequence(n) << endl;

	return 0;
}

int Sequence(int n) {
	if (n == 0)
		return 0;
	else if (n == 1)
		return 1;
	else
		return Sequence(n / 2) + Sequence(n - 1);
}