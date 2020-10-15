#include <iostream>

using namespace std;

void print(int n, int level);

int main() {
	int n;
	
	cin >> n;

	if (0 < n && n <= 100)
		print(n, 0);

	return 0;
}

void print(int n, int level) {
	if (n == 1) {
		cout << n << endl;
		cout << level << endl;
		return;
	}
	else cout << n << " -> ";

	if (n%2 == 0)
		print(n / 2, ++level);
	else
		print(n / 3, ++level);
}