#include <stdio.h>
#include <math.h>


int main(){
	
	//declaração de variáveis
	
	float a, b, c, d, mediaq;


	//entrada
	
	printf("Digite um numero: ");
	scanf("%f", &a);
	
	printf("Digite o segundo numero: ");
	scanf("%f", &b);
	
	printf("Digite o terceiro numero: ");
	
	scanf("%f", &c);
	printf("Digite o quarto numero: ");
	scanf("%f", &d);
	

	//processamento
	
	mediaq = sqrt( (pow(a,2) + pow(b,2) + pow(c,2) + pow(d,2))/4);
		

	//saida
	
	printf("A media quadrática dos numeros digitados é %.4f", mediaq);
	
	
	return 0;
}
