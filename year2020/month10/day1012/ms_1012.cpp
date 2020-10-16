#include <iostream>

using namespace std;

void Print(int n, int m, int data[], int level);

int main() {
	int n, m;
	int data[10];

	cin >> n >> m;

	if (0 < n && n <= 10 && 0 < m) {
		Print(n, m, data, 1);
	}
	return 0;
}

void Print(int n, int m, int data[], int loc) {
	for (int i = 1; i <= 6; i++) {
		data[loc - 1] = i;

		if (loc == n) {
			int sum = 0;

			for (int j = 0; j < n; j++)
				sum += data[j];

			if (sum == m) {
				for (int h = 0; h < n; h++) {
					cout << data[h];

					if (h != n)
						cout << ' ';
				}

				cout << endl;
				return;
			}
		}
		else Print(n, m, data, loc + 1);
	}
}