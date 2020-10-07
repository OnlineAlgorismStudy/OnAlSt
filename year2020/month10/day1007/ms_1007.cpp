#include <iostream>
#include <cmath>

using namespace std;

int ESP(int n); // Each Sum of Power

int main() {
	int n;

	cin >> n;

	if (0 < n && n < 1000000000)
		cout << ESP(n) << endl;

	return 0;
}

int ESP(int n) {
	if (n == 0)
		return 0;
	else
		return pow(n % 10, 2) + ESP(n / 10);
}