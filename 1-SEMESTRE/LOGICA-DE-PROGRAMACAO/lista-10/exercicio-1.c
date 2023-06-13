#include <stdio.h>
#include <string.h>

int main(int argc, char **argv)
{
	char str[9] = "lua",str2[6]= "cheia";
	strcat(str, str2);
	
	printf("string1: %s\n", str);
	printf("string2: %s\n", str2);
	return 0;
}

