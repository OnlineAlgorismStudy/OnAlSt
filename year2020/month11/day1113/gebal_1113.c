#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>

int main() {

	char origin[21], buf[21], realArea[20];
	char *p;
	int integerNumber, cnt;
	double real, realNumber;

	scanf("%s", buf);
	strcpy(origin, buf);

	p = strtok(buf, ".");
	integerNumber = atoi(p);
	printf("%d\n", integerNumber * 2);

	p = strtok(NULL, ".");
	strcpy(realArea, p);

	p = strtok(realArea, "*");
	real = atof(p);

	realNumber = (double)integerNumber;

	p = strtok(NULL, "*");
	if (p == NULL) {
		printf("%0.2lf", floor(atof(origin) * 10 + 0.5) / 10);
		return 0;
	}

	cnt = atoi(p);
	
	for (int i = 1; i <= cnt; i++) {
		realNumber += (real / pow(10, i));
	}
	printf("%0.2lf\n",  floor(realNumber * 10 + 0.5) / 10);
	

	return 0;
}
