#include <iostream>
#include <cstring> // for strlen
#include <cctype> // for toupper, isalpha

using namespace std;

void lib_func(char input[]);
void none_func(char input[]);

int main() {
	// 1988-Seoul-Olympic!!!
	char input[100];
	
	cin >> input;

	lib_func(input);
	//none_func(input);

	return 0;
}

// use library function
void lib_func(char input[]) {
	for (int i = 0; i < strlen(input); i++)
		if (isalpha(input[i]))
			cout << (char)toupper(input[i]);
}

// not use library function
void none_func(char input[]) {
	int count = 0;

	while (input[count] != NULL)
		count++;

	for (int i = 0; i < count; i++) {
		if ((65 <= input[i] && input[i] <= 90) || (97 <= input[i] && input[i] <= 122)) {
			if (97 <= input[i] && input[i] <= 122)
				cout << (char)(input[i] - 32);
			else
				cout << input[i];
		}
	}
}