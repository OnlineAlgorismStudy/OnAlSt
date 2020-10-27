#include<stdio.h>

int main() {
	char c;
	while (1) {
		scanf(" %c", &c);
		if ((c > 64 && c < 91) || (c > 96 && c < 123)) 
			printf("%c\n", c);
		else if (c > 47 && c < 58)
			printf("%d\n", c);
		else 
			break;
	}
	return 0;
}
