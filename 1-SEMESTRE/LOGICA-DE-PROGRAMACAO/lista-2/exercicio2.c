#include <stdio.h>

int main(){
	
	//declaração de variáveis
	float total_price;
	float portion;


	//entrada
	printf("Digite o valor da sua compra que será parcelada: ");
	scanf("%f", &total_price);
	
	//processamento
	
	portion = total_price/5;
		
	//saida
	
	printf("Compra parcelada\n");
	
	printf("5 x %.2f = %.2f", portion, total_price);
	
	return 0;
}
