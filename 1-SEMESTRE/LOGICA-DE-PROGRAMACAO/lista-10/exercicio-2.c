#include <stdio.h>
#include <string.h>
#define TAM 50

int main(int argc, char **argv)
{
	char str[TAM],str2[TAM], str3[TAM * 2];
	int tam =0, tam2 =0, tam3 =0;
		
	printf("Digite a 1a String: " );
	fgets(str,TAM,stdin);
	tam = strlen(str) -1;
	
	printf("Digite a 2a String: " );
	fgets(str2, TAM,stdin);
	tam2 = strlen(str2) -1;
	
	strcpy(str3,str);
	strcat(str3, " ");
	strcat(str3, str2);
	// verificar o porque está imprimindo em 2 linhas separadas
	tam3 = strlen(str3) -1;
	
	printf("string3: %s", str3);
	printf("Tamanhos: %d %d %d \n: ", tam,tam2, tam3);
			
	
	
	return 0;
}

