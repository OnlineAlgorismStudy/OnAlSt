#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

int main()
{
	while (true)
	{
		char c;
		scanf(" %c", &c);

		if (!isdigit(c))
		{
			int asc = (int)c;

			if (asc < 65 || asc > 122)
				return 0;

			printf("%c\n", c);
		}
		else
		{
			printf("%d\n", c);
		}
	}
}
