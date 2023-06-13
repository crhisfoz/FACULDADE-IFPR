#include <stdio.h>
#include <string.h>
#define TAM 100

	int main(){
		char str[TAM], letra;
		int total=0, i;
		
		printf("\nDigite uma palavra: ");
		fgets(str, sizeof(str), stdin);
		
		printf("\nDigite uma letra para buscar: ");
		scanf(" %c", &letra);
		
		for(i=0; i<strlen(str);i++){
			if(str[i] == letra){
				total++;
			}
		}
		printf("\nTotal de letras '%c' encontradas na palavra: %d", letra, total);
		
	return 0;
	}
