#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int num;
	int min_num = 9876543;

	for(int i=0; i<10; i++)
	{
 		scanf("%d", &num);

		if(num < min_num)
			min_num = num;
	}

	printf("%d\n", min_num);
}
