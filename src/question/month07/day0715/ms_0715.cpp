#include <iostream>
#include <string>
#include <cstdlib>

using namespace std;

int main() {
	int n;

	cin >> n;

	for (int i = -n; i <= n; i++)
		if(i != 0)
			cout << string(abs(i), '*') << endl;

	return 0;
}