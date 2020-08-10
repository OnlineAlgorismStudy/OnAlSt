#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	vector<int> v;
	int num;
	for(int i=0; i<10; i++)
	{
 		scanf("%d", &num);
		v.push_back(num);
	}
	sort(v.begin(), v.end(), greater<int>());

	for(int i=0; i<10; i++)
	{
		printf("%d ", v[i]);
	}
	printf("\n");
}
