#include <stdio.h>
#include <string.h>
#include <ctype.h>
#define TAM 100

	int main(){
		char str[TAM];
		int i;
		
		printf("\nDigite uma palavra: ");
		fgets(str, sizeof(str), stdin);
		
		for(i=0; i<strlen(str);i++){
			str[i] = toupper(str[i]);
		}
		printf("\n Palavra em maiuscula: %s", str);
		
	return 0;
	}
