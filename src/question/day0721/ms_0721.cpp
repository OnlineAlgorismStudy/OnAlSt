#include <iostream>

using namespace std;

int main() {
	int n, intNum = 1;
	char charNum = 'A';

	cin >> n;

	for (int i = n; i > 0; i--) 
	{
		for (int j = 0; j < n + 1; j++)
			if (j < i)
				cout << intNum++ << ' ';
			else
				cout << charNum++ << ' ';

		cout << endl;
	}
	return 0;
}