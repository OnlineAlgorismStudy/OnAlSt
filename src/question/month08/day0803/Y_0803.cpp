#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	char c[10];
	for(int i=0; i<10; i++)
	{
		scanf(" %c", &c[i]);
	}

	printf("%c %c %c", c[0], c[3], c[6]);
}
