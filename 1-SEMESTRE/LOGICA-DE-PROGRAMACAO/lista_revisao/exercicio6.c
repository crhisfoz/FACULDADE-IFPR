#include <stdio.h>

int main() {
	//declaração de variáveis
	
	float price_buy, tax_discount, tax_addition, discount, addition, price_discount, price_addition;
	
	//entrada de dados
	
	tax_discount = 0.1;
	tax_addition = 0.05; 
		
	printf("Por favor Digite o valor total de sua compra: ");
	scanf("%f", &price_buy);
	
	//processamento 
	discount = price_buy * tax_discount;
	addition = price_buy * tax_addition;
	price_discount = price_buy - discount;
	price_addition = price_buy + addition;
	
		
	//saída
	
	printf("O valor total de sua compra com um desconto de 10%% é %.2f: ", price_discount);
	printf("\n E o valor de sua compra com um acréscimo de 5%% é %.2f: ", price_addition);
	
	
	return 0;
}
