#include <stdio.h>

int main(){
	
	//declaração de variáveis
	float width, length, carpetPrice, totalPrice;
	
	//entrada
	
	printf("Digite a largura da sua sala: ");
	scanf("%f", &width);
	
	printf("Digite o comprimento da sua sala: ");
	scanf("%f", &length);
	
	printf("Digite o preço do metro quadrado do seu carpete: ");
	scanf("%f", &carpetPrice);
	
	//processamento
	
	totalPrice = width * length * carpetPrice;
	
	
	//saida
	
	printf("O preço total do serviço para forrar sua sala é de %f", totalPrice);

	return 0;
}
