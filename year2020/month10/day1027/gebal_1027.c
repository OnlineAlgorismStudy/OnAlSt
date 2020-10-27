#include<stdio.h>
#include<string.h>

int main() {
	char s[101];
	scanf("%s", s);
	for (unsigned int i = 0; i < strlen(s); i++) {
		if ((s[i] > 64 && s[i] < 91))
			printf("%c", s[i]);
		else if ((s[i] > 96 && s[i] < 123))
			printf("%c", s[i] - 32);
	}
	return 0;
}
