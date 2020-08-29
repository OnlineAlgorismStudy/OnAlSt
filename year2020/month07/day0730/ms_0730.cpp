#include <iostream>

using namespace std;

int main() {
	int n, count = 1;

	cin >> n;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cout << count;
			count += 2;

			if (count >= 10)
				count = 1;

			if (j != n)
				cout << ' ';
		}

		cout << endl;
	}

	return 0;
}