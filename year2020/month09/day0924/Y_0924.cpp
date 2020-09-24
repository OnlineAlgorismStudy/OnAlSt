#include <iostream>
#include <math.h> 
using namespace std;

int main() 
{
	int n[5];
	for(int i=0; i<5; i++)
		scanf("%d", &n[i]);

	int sum = 0;
	for(int i=0; i<5; i++)
		sum += abs(n[i]);

	printf("%d\n", sum);
	return 0;
}
