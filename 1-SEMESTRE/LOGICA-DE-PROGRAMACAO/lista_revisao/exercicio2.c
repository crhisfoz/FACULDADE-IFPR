#include <stdio.h>

int main() {
	//declaração de variáveis
	
	int numA, predecessor, successor; 
	
	//entrada de dados
	
	printf("Digite um número inteiro: " );
	
	scanf("%d", &numA);
	
	//processamento 
	predecessor = numA - 1;
	successor = numA + 1;
	
	//saída
	
	printf("O antecessor do número informado é %d", predecessor);
	printf("\n O sucessor do número informado é %d", successor);
	
	return 0;
}
