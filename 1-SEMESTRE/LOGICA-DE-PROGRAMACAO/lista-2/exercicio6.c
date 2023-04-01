#include <stdio.h>
#include <math.h>


int main(){
	
	//declaração de variáveis
	float num, lower_num, upper_num;

	//entrada
	
	printf("Digite um numero real (float): ");
	scanf("%f", &num);
	

	//processamento
	
	lower_num = floor(num);
	upper_num = ceil(num);
	
	

	//saida
	
	printf("O numero digitado é %f e o arredondamento para baixo é %.f e o arredondamento para cima é %.f", num, lower_num, upper_num);
	

	
	return 0;
}
