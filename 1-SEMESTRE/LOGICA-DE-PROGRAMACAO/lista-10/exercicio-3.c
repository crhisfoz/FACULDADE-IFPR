#include <stdio.h>
#include <string.h>
#define TAM 100

	int main(){
		char str[TAM];
		int total=0, i;
		
		printf("\nDigite uma string: ");
		fgets(str, sizeof(str), stdin);
		
		for(i=0; i<strlen(str);i++){
			if(str[i] == 'o'){
				total++;
			}
		}
		printf("Total de letras 'o' existentes na string: %d", total);
		
	return 0;
	}
