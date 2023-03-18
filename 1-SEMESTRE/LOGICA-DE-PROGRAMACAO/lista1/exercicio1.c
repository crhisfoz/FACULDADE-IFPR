#include <stdio.h>

int main(){
	
	//declaração de variáveis
	
	int numA, numB, sumTotal, reduceTotal, multTotal, divTotal;
	
	//entrada
	
	printf("Digite um número inteiro: ");
	
	scanf("%d", &numA);
	
	printf("Digite outro número inteiro: ");
	
	scanf("%d", &numB);
	
	//processamento
	
	sumTotal = numA + numB;
	
	reduceTotal = numA - numB;
	
	multTotal = numA * numB;
	
	divTotal = numA / numB;
	
	
	//saida
	
	printf(" O Resultado da soma é: %d\n", sumTotal);
	printf(" O Resultado da subtração é: %d\n", reduceTotal);
	printf(" O Resultado da multiplicação é: %d\n", multTotal);
	printf(" O Resultado da divisão é: %d0", divTotal);
	
	return 0;
}
