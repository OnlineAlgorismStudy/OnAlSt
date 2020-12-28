#include <iostream>

using namespace std;

int main() {
	int n;
	int m;

	cin >> n >> m;

	if ((1 <= n && n <= 1000) && (1 <= m && m <= 1000)) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				cout << '*';
			}

			cout << endl;
		}
	}

	return 0;
}