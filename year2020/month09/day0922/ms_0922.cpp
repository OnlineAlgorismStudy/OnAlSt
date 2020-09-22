#include <iostream>
#include <cmath>

#define SQUARE(x, y) pow((x - y), 2)
#define CUBE(x, y) pow((x + y), 3)

using namespace std;

int main() {
	int x, y;

	cin >> x >> y;

	cout << "(" << x << " - " << y << ") ^ 2 = " << SQUARE(x, y) << endl;
	cout << "(" << x << " + " << y << ") ^ 3 = " << CUBE(x, y) << endl;

	return 0;
}