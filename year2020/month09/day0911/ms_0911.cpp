#include <iostream>

using namespace std;

void Sum(int n) {
	int total = 0;

	for (int i = 1; i <= n; i++)
		total += i;

	cout << total << endl;
}

int main() {
	int n;

	cin >> n;

	if (1 <= n && n <= 1000)
		Sum(n);

	return 0;
}