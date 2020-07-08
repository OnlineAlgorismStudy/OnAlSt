#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;
void print();
static char c;

int main() {
	c = 'Y';
	while(c == 'Y')
	{
		print();
		fflush(stdin);
	}
}

void print()
{
	int base, height;

	printf("Base = ");
	scanf("%d", &base);
	printf("Height = ");
	scanf("%d", &height);
	printf("Triangle width = %.1f\n", (double)base*height/2);

	printf("Continue? ");
	scanf(" %c", &c);
}
