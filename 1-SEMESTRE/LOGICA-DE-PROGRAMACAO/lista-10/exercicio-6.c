#include <stdio.h>
#include <string.h>
#define TAM 100

	int main(){
		char str1[TAM], str2[TAM];
		int i, j =0, tam;
		
		printf("\nDigite uma palavra: ");
		fgets(str1, sizeof(str1), stdin);
		
		tam = strlen(str1);
		
		for(i=tam-1; i>=0; i--){
			str2[j] = str1[i];
			j+=1;
		}
		
		str2[j] = '\0';
		
		printf("\nPalavra invertida: %s", str2);
		
	return 0;
	}
