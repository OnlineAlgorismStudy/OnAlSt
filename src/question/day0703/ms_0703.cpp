#include <iostream>

using namespace std;

int main() {
	int width;
	int length;

	cin >> width >> length;

	width += 5;
	length *= 2;

	cout << "width = " << width << endl;
	cout << "length = " << length << endl;
	cout << "area = " << width * length << endl;
 
	return 0;
}
