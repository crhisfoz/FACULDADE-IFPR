#include <stdio.h>

int main()
{
 //declaracao de variaveis

char nameSeller[50];
float commission, totalSales, commissionTotal;

//entrada de dados

commission = 0.1;
printf("Digite o nome de um vendedor: ");
scanf("%s", nameSeller);

printf(" Digite o total de vendas desse vendedor: ");
scanf("%f", &totalSales);

//processamento

commissionTotal = totalSales * commission;

//saída
printf("O valor total de comissão do vendedor %s, e sua comissão é %f", nameSeller, commissionTotal);
	
	return 0;
}

