#include <stdio.h>

int main(int argc, char **argv)
{
	int num = 0, i = 1;


	while(i < 100)
		{
			num = num + i;
			i = i + 2;
			}
			printf("%d ", num);
	
	return 0;
}

