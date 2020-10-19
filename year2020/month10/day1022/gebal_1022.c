#include<stdio.h>
#include<string.h>

int main() {
	int n, len = 0;
	char str[101];
	scanf("%s %d", str, &n);
	len = strlen(str);
	if (len < n) {
		printf("%s", str);
	}
	else {
		for (int i = 0; i < 3; i++)
			printf("%c", str[len - i - 1]);
	}
}
