#include <iostream>
#include <string>
using namespace std; 

void print()
{
	string s = "~!@#$^&*()_+|";
	cout<<s<<endl;
}

int main() {
	
	
	int num;
	scanf("%d", &num);

	for(int i=0; i<num; i++)
	{
		print();
	}
}
