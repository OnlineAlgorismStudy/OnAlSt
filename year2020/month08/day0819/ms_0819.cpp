#include <iostream>

using namespace std;

int main() {
	int count[26] = { 0, };
	char cnd;

	for ( ; ; ) {
		cin >> cnd;

		if (!('A' <= cnd && cnd <= 'Z'))
			break;
		
		count[cnd - 'A']++;
	}
	
	for (int i = 0; i < 26; i++)
		if(count[i] != 0)
			cout << char('A' + i) << " : " << count[i] << endl;

	return 0;
}