#include <stdio.h>
#include <math.h>


int main(){
	
	//declaração de variáveis
	int value1, value2, value3;

	
	//entrada
	printf("Digite um valor: ");
	scanf("%d", &value1);
	
	printf("Digite um  segundo valor: ");
	scanf("%d", &value2);
	
	
	printf("Os valores digitados foram %d e %d", value1,value2);
	
	//processamento
	

	value3 = value2;
	value2 = value1;
	 
	
		
	//saida
	
printf(", e seus valores invertidos sao %d e %d", value3,value2);
	
	
	return 0;
}
