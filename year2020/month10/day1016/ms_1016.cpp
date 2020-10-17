#include <iostream>

using namespace std;

void Print(int data[], int loc, int n);

int main() {
	int n;
	int data[10];

	cin >> n;

	if (0 < n && n <= 10)
		Print(data, 0, n);

	return 0;
}

void Print(int data[], int loc, int n) {
	for (int i = 1; i <= 6; i++) {
		if (loc == 0) {
			// data[0] = 1 ~ 6
			data[loc] = i;
		}
		else {
			// start previous data[loc] value and plus (i-1)
			data[loc] = data[loc - 1] + (i - 1);
		}

		if (data[loc] > 6) {
			// then remove out of range values
			return;
		}

		if (loc == n - 1) {
			// if all data inserted, then print
			// if not, then resume recursion with increased loc
			for (int j = 0; j < n; j++) {
				cout << data[j];

				if (j != n)
					cout << ' ';
			}

			cout << endl;
		}
		else Print(data, loc + 1, n);
	}
}