#include <iostream>

using namespace std;

int main() {
	const char* capital[] = { "Seoul", "Washington", "Tokyo", "Beijing" };
	const char* state[] = { "Korea", "USA", "Japen", "China" };

	while (true) {
		for (int i = 0; i < 4; i++) {
			cout << (i + 1) << ". " << *(state + i) << endl;
		}
		int cnt;

		cout << "number? ";
		cin >> cnt;
		
		switch (cnt) {
		case 1:
		case 2:
		case 3:
		case 4:
			cout << endl << *(capital + cnt - 1) << endl << endl;
			break;
		default:
			cout << endl << "none" << endl;
			return 0;
		}
	}
}