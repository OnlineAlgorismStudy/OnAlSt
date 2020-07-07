#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int number;
	printf("Number? ");
	scanf("%d", &number);

	if(number == 1)
		printf("dog\n");
	else if(number == 2)
		printf("cat\n");
	else if(number == 3)
		printf("chick\n");
	else
		printf("I don't know.\n");
}
