#include<stdio.h>
#include<string.h>


int main() {

	char buf[29] = { 0 };
	char *fighting = "fighting";
	scanf("%s", buf);
	strcat(buf, fighting);
	printf("%s", buf);

	return 0;
}
