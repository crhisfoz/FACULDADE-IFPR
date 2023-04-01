#include <stdio.h>
#include <math.h>

int main(){
	
	//declaração de variáveis
	float num, square_num, cube_num;
	
	//entrada
	printf("Digite um numero para calcular: ");
	scanf("%f", &num);
	
	//processamento
	square_num = pow(num, 2);
	cube_num = pow(num, 3);

	//saida
	
	printf("numero\tquadrado\tcubo\n%.1f\t%.1f\t\t%.1f",num, square_num, cube_num);
	
	return 0;
}
