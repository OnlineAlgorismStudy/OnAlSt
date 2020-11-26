#include <iostream>
#include <string> // for to_string, length, replace, substr
#include <cmath> // for round

using namespace std;

int main() {
	int A;
	double B;
	string C;

	cin >> A >> B >> C;

	// B : 5.0123
	// to_string(B) : 5.0123000
	string strDouble = to_string(round(B * 1000) / 1000);

	for (int i = strDouble.length() - 1; i >= 0; i--) {
		if (strDouble[i] == '0') {
			strDouble.replace(i, 1, "");
		}
		else break;
	}

	string total = to_string(A) + strDouble + C;
	int n = total.length();

	if (n % 2 == 0)
		n /= 2;
	else
		n = n / 2 + 1;

	if (n <= 30) {
		cout << total.substr(0, n) << endl;
		cout << total.substr(n, total.length()) << endl;
	}

	return 0;
}
