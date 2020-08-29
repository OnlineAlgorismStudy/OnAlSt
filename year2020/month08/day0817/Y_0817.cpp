#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	vector<int> v;
	int num;

	while(true)
	{
		scanf("%d", &num);
		if(num == 0)
			break;

		if(num%2 == 0)
			num /= 2;
		else
			num *= 2;

		v.push_back(num);
	}

	for(int i=0; i<v.size(); i++)
		printf("%d ", v[i]);
	printf("\n");
}
