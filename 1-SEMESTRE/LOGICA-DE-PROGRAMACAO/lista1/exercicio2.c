#include <stdio.h>

int main()
{
	
//declaracao variável 

float valorDolar, valorCotacao, valorConversao;


printf("Digite o Valor da cotação do dólar no dia de hoje: ");

scanf("%f", &valorCotacao);

printf("Digite o Valor em dolar que você deseja converter: ");

scanf("%f", &valorDolar);

valorConversao = valorDolar * valorCotacao;

printf("O valor Total da conversão é: %f", valorConversao);
	
	return 0;
}

