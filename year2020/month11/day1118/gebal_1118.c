#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
	char buf[5][50] = { "flower", "rose", "lily", "daffodil", "azalea" };
	char inp;
	int cnt = 0;
	scanf("%c", &inp);

	for (int i = 0; i < 5; i++) {
		if (buf[i][1] == inp || buf[i][2] == inp) {
			printf("%s\n", buf[i]);
			cnt++;
		}
	}
	printf("%d", cnt);
	
}
