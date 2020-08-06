#include<stdio.h>

int main() {
	int i;
	printf("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? ");
	scanf("%d", &i);
	switch (i)
	{
	case 1:
		puts("Seoul");
		break;
	case 2:
		puts("Washington");
		break;
	case 3:
		puts("Tokyo");
		break;
	case 4:
		puts("Beijing");
		break;
	default:
		puts("none");
		break;
	}
}
