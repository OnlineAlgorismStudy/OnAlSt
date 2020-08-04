#include <iostream>
//#include <string> // for string()

using namespace std;

int main() {
	int n;

	cin >> n;

	for (int i = -(n - 1); i <= (n - 1); i++) 
	{
		if (i <= 0) 
		{
			for (int j = 0; j < n - abs(i); j++) 
			{
				cout << '#';

				if (j != (n - abs(i)))
					cout << ' ';
			}
		}
		else 
		{
			// cout << string(2*i, ' ');
			for (int j = 0; j < i; j++)
			{
				cout << "  ";
			}

			for (int j = 0; j < n - i; j++) 
			{
				cout << '#';

				if (j != n - i)
					cout << ' ';
			}
		}

		cout << endl;
	}

	return 0;
}