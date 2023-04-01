#include <stdio.h>
#include <math.h>


int main(){
	
	//declaração de variáveis
	
	float a, b, c, d, mediah;


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
	
	mediah = (4 / (1/a + 1/b + 1/c + 1/d));
		

	//saida
	
	printf("A media harmonica dos numeros digitados é %.4f", mediah);
	
	
	return 0;
}
