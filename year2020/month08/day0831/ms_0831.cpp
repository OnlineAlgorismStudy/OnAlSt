#include <iostream>

using namespace std;

int main() {
	char data[3][5];
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 5; j++) {
			char temp;

			scanf_s("%c", &temp);
			
			if ('A' <= temp && temp <= 'Z')
				data[i][j] = temp;
			else j--;
		}
	}

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 5; j++) {
			cout << char(data[i][j] + 32);
			
			if (j != 5)
				cout << ' ';
		}

		cout << endl;
	}

	return 0;
}