#include <iostream>

using namespace std;

enum ANIMAL { DOG = 1, CAT, CHICK };

int main() {
	int num;
	
	cout << "Number? ";
	cin >> num;

	switch (num) {
	case DOG:
		cout << "dog" << endl;
		break;
	case CAT:
		cout << "cat" << endl;
		break;
	case CHICK:
		cout << "chick" << endl;
		break;
	default:
		cout << "I don't know." << endl;
		break;
	}

	return 0;
}