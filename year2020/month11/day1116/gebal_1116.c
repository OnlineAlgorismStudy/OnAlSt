#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
	char int_arr[5][20];
	char buf[101] = "";
	for (int i = 0; i < 5; i++) {
		scanf("%s", int_arr[i]);
		strcat(buf, int_arr[i]);
	}
	
	for (unsigned int i = 0; i < strlen(buf); i++) {
		printf("%c", buf[i]);
		if ((i+1) % 3 == 0) {
			printf("\n");
		}
	}
	
}
