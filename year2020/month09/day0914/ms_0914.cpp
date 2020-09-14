#include <iostream>

using namespace std;

void printRec(int n);

int main() {
	int n;

	cin >> n;

	if (1 <= n && n <= 100)
		printRec(n);
	
	return 0;
}

void printRec(int n) {
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			cout << i * j;

			if (j != n)
				cout << ' ';
		}

		cout << endl;
	}
}