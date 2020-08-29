#include <iostream>
#define YD 91.44

using namespace std;

int main() {
	double yard;

	cout << "yard? ";
	cin >> yard;
	printf("%.1lfyard = %.1lfcm", yard, (yard * YD));

	return 0;
}