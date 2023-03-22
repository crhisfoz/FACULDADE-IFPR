#include <stdio.h>

int main() {
	//declaração de variáveis
	float area, base, height;
	
	//entrada de dados
	printf("Para calcular a area de um triangulo, digite o valor da base: ");
		scanf("%f", &base);
	printf("Agora digite o valor da altura: ");
		scanf("%f", &height);
	
	//processamento 
	
	area = base * height;
	
	//saída
	
	printf("A área do triangulo é %f ", area);
	
	return 0;
}
