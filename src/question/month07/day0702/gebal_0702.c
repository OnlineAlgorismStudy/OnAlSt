#include<stdio.h>
#include<math.h>
int main() {
	double yard = 91.44,inp;
	printf("yard?");
	scanf("%lf", &inp);
	printf("%lfyard = %0.1lf", inp, round(inp * yard * 100) / 100);
}
