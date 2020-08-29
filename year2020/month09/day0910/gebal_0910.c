#include<stdio.h>

void proc(int n) {
	switch (n)
	{
	case 0: printf("first\n"); break;
	case 1: printf("second\n"); break;
	case 2: printf("third\n"); break;
	default:
		break;
	}
	for (int i = 0; i < 9; i++) {
		printf("@");
	}
	printf("\n");
}

int main() {
	for (int i = 0; i < 3; i++) {
		proc(i);
	}
}
