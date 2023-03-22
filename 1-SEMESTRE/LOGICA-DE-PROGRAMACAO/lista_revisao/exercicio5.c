#include <stdio.h>

int main() {
	//declaração de variáveis
	float cost_price, sale_price, change_value;
	
	//entrada de dados
	printf("Digite o valor do produto: ");
	scanf("%f", &cost_price);
	
	printf("Digite o valor total pago pelo produto: ");
	scanf("%f", &sale_price);
		
	//processamento 
	
	change_value = sale_price - cost_price;
	
	//saída
	
	printf("O valor de troco foi: %f", change_value);
	
	return 0;
}
