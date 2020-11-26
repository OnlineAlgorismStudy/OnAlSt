#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
	char buf[101];
	char *ptr;
	gets_s(buf, 100);

	ptr = strtok(buf, " ");
	while (ptr != NULL)
	{
		printf("%s\n", ptr);
		ptr = strtok(NULL, " ");
		
	}
	
}
