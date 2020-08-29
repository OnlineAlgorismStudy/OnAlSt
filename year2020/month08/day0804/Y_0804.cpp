#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;


int main() {
	int num[100];
	int cnt = 0;

	while(true)
	{
 		scanf("%d", &num[cnt]);

		if(num[cnt] == 0)
			break;
		cnt++;
	}

	for(int i=cnt-1; i>=0; i--)
		printf("%d ", num[i]);
}
