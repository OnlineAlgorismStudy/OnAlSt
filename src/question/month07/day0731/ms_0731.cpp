#include <iostream>

using namespace std;

int main() {
	int start = 0, end = 0;

	while (true) {
		cin >> start >> end;

		if (!((2 <= start && start <= 9) && (2 <= end && end <= 9)))
			cout << "INPUT ERROR!" << endl;
		else
			break;
	}

	for (int i = 1; i <= 9; i++) {
		if (start <= end) {
			for (int j = start; j <= end; j++) {
				printf("%d * %d = %2d", j, i, (j * i));

				if (j != end)
					cout << "   ";
			}
		}
		else {
			for (int j = start; j >= end; j--) {
				printf("%d * %d = %2d", j, i, (j * i));

				if (j != end)
					cout << "   ";
			}
		}

		cout << endl;
	}

	return 0;
}