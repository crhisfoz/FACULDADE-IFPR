#include <stdio.h>

int main() {
	//declaração de variáveis
	
	float numA, numB, numC, numD, average;
	
	//entrada de dados
	printf( " Entre com o primeiro ńumero real : ");
		scanf("%f", &numA);
	printf( " Entre com o segundo ńumero real : ");
		scanf("%f", &numB);
	printf( " Entre com o terceiro ńumero real : ");
		scanf("%f", &numC);
	printf( " Entre com o quarto ńumero real : ");
		scanf("%f", &numD);
	
	//processamento 

	average = (numA + numB +numC + numD) / 4;
	
	//saída
	
	printf("A média dos 4 números digitados é %f", average);
	
	return 0;
}
