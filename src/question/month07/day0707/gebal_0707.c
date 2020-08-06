#include<stdio.h>

int main() {
	int i;
	printf("Number? ");
	scanf("%d", &i);

	switch (i)
	{
	case 1:
		puts("dog");
		break;
	case 2:
		puts("cat");
		break;
	case 3:
		puts("chick");
		break;
	default:
		puts("I don't know.");
		break;
	}
}
