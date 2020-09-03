#include <iostream>
#include <algorithm>
#include <string>
using namespace std; 

void printMax(int n1, int n2, int n3)
{
	printf("%d\n", (max(max(n1,n2),n3)));
}

int main() {
	int n1, n2, n3;
	scanf("%d %d %d", &n1, &n2, &n3);

	printMax(n1, n2, n3);
}
