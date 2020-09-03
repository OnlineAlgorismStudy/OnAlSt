#include <iostream>
#include <string>
using namespace std; 

void print(int n)
{
	int num = 1;
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<n; j++)
		{
			printf("%d ", num++);
		}
		printf("\n");
	}
}

int main() {
	int num;
	scanf("%d", &num);

	print(num);
}
