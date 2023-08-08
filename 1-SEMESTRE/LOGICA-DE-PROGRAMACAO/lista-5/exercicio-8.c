#include <stdio.h>
#include <math.h>

int main(int argc, char **argv)
{
	int pg=10, i=0;
	float num = -2,r= -2;
	
	while(i < pg){
		printf("%.f ", num);
		num *= r;
		i++;
		}
	
	return 0;
}

