#include <stdio.h>

int main() {
	//declaração de variáveis
	
	int numA, double_numA;
	
	//entrada de dados
		
	printf(" Digite o número inteiro que deseja calcular o dobro: ");
	scanf("%d", &numA);
	
	//processamento 
	double_numA = numA * 2;
	
	//saída
	printf("O dobro do número informado é %d", double_numA);
	
	return 0;
}
