#include <iostream>

using namespace std;

int main() {
	for (int i = 2; i < 5; i++) {
		for (int j = 1; j < 6; j++)
			printf("%d * %d = %2d   ", i, j, (i*j));

		cout << endl;
	}
	return 0;
}