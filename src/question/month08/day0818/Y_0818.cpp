#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	vector<int> v;
	int n;
	scanf("%d", &n);

	for(int i=0; i<n; i++)
	{
		int num;
		scanf("%d", &num);
		v.push_back(num);
	}

	sort(v.begin(), v.end(), greater<int>());

	for(int i=0; i<n; i++)
		printf("%d\n", v[i]);
}
