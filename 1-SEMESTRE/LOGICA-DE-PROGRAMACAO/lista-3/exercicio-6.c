#include <stdio.h>
#include <ctype.h>

int main(int argc, char **argv)
{
	float salario;
	double novo_salario;
	
	printf("Digite o valor do salario que deseja calcular o reajuste: ");
	scanf("%f", &salario);
	
	if((salario > 0)&& (salario <= 990)){
		novo_salario = salario * 1.2;
		printf("O salario de R$ \'%.2f\' com reajuste de \'20%%\' e igual a %.2f", salario, novo_salario);
	}else if((salario > 990)&& (salario <= 1480)){
		novo_salario = salario * 1.1;
		printf("O salario de R$ \'%.2f\' com reajuste de \'10%%\' e igual a %.2f", salario, novo_salario);
	}else if((salario > 1480)&& (salario <= 2000)){
		novo_salario = salario * 1.05;
		printf("O salario de R$ \'%.2f\' com reajuste de \'5%%\' e igual a %.2f", salario, novo_salario);
	}
	else{
		printf(" Salario acima do valor permitido para reajuste");
		};
	
	
	return 0;
}
