#include <iostream>

using namespace std;

int main() {
	int kor = 90, mat = 80, eng = 100;
	int sum = kor + mat + eng;
	int avg = sum / 3;

	cout << "kor " << kor << "\nmat " << mat << "\neng " << eng << "\nsum " << sum << "\navg " << avg << endl;
	return 0;
}