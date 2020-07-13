#include <iostream>

using namespace std;

int main() {
	int rowMax = 4;
	int columnMax = 5;

	for (int i = 2; i <= rowMax; i++) {
		for (int j = 1; j <= columnMax; j++) {
			printf("%d * %d = %2d", i, j, (i * j));

			if (j != columnMax)
				cout << "   ";
		}
		cout << endl;
	}
	return 0;
}
