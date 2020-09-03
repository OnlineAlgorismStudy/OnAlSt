#include <iostream>

using namespace std;

void DrawRec(int n);

int main() {
	int n;

	cin >> n;

	if (0 < n && n < 100) {
		DrawRec(n);
	}

	return 0;
}

void DrawRec(int n) {
	int count = 1;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cout << count;
			count++;

			if (j != n)
				cout << ' ';
		}

		cout << endl;
	}
}