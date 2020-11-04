#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
	string data;

	getline(cin, data);

	stringstream ss(data);
	int i = 1;

	while (getline(ss, data, ' ')) {
		cout << i << ". " << data << endl;
		i++;
	}

	return 0;
}