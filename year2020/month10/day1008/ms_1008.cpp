#include <iostream>

using namespace std;

void half(int n);

int main() {
	int n;

	cin >> n;

	if (0 < n)
		half(n);
	
	return 0;
}

void half(int n) {
	if (n == 0)
		return;

	half(n / 2);
	cout << n << ' ';
}