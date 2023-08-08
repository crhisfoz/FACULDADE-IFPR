#include <stdio.h>
#include <string.h>
#define TAM 100

	int main(){
		char str1[TAM],str2[TAM];
		int res=0;
		
		printf("\nDigite a primeira string: ");
		fgets(str1, sizeof(str1), stdin);
		
		printf("\nDigite a segunda string: ");
		fgets(str2, sizeof(str2), stdin);
		
		res = strcmp(str1, str2);
		
		if(res == 0){
			printf("\nComparacao de strings: as strings sao iguais");
		}
		else{
			printf("\nComparacao de strings: as strings sao diferentes");
		}
		
	return 0;
	}
