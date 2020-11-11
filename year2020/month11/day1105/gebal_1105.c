#include<stdio.h>
#include<string.h>


int main() {
	char buf[5][31] = { 0 };
	
	for (int i = 0; i < 5; i++) {
		scanf("%s", buf[i]);
	}
	for (int i = 4; i >= 0; i--) {
		printf("%s\n", buf[i]);
	}
	return 0;
}
