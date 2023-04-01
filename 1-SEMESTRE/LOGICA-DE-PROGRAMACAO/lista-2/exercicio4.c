#include <stdio.h>
#include <math.h>

int main(){
	
	//declaração de variáveis
	float num;
	float raiz;
	
	//entrada
	printf("Digite um numero para calcular a raiz quadrada: ");
	scanf("%f", &num);
	
	//processamento
	raiz = sqrt(num);

	//saida
	
	printf("A raiz quadrada do numero %.4f é %.4f", num, raiz);
	
	return 0;
}
