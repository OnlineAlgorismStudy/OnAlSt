#include <iostream>
#include <string>

using namespace std;

int main() {
	int n, j = 0;

	cin >> n;
	
	for (int i = n; i > 0; i--, j++) {
		printf("%s", string(j, ' ').c_str());
		printf("%s\n", string(2 * i - 1, '*').c_str());
	}

	return 0;
}